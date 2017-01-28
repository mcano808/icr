package com.icr.ingest.repositories;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ScriptOperations;
import org.springframework.data.mongodb.core.script.ExecutableMongoScript;
import org.springframework.stereotype.Service;

/**
 * Checks existing database scripts and executes new ones.
 */
@Service
public class MongodbMigrator
{
    @Autowired
    private MongoTemplate mongoTemplate;

    private static final Logger log = LoggerFactory.getLogger(MongodbMigrator.class);

    public void runMigrate() throws IOException
    {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        List<String> fileNames = FileUtils.readLines(resolver.getResource("db/updates.txt").getFile(), StandardCharsets.UTF_8);
        String filePattern = "classpath:db/%s";
        List<Resource> resources = fileNames.stream()
                .map(name -> name.trim())
                .filter(name -> name.length() > 0 && !name.trim().startsWith("#")) // filter out comments
                .map(name -> resolver.getResource(String.format(filePattern, name)))
                .collect(Collectors.toList());

        List<String> executedScriptNames = getExecutedScriptsFromDatabase(mongoTemplate);
        Map<String, String> allScripts = readAllScripts(resources);

        for (String scriptName : sortScriptNames(allScripts.keySet()))
        {
            if (!scriptInDatabase(executedScriptNames, scriptName))
            {
                execute(mongoTemplate, scriptName, allScripts.get(scriptName));
            }
        }
    }

    private List<String> getExecutedScriptsFromDatabase(MongoTemplate mongoTemplate)
    {
        List<DatabaseScript> databaseScripts = mongoTemplate.findAll(DatabaseScript.class);

        List<String> executedScriptNames = new ArrayList<>();
        for (DatabaseScript s : databaseScripts)
        {
            executedScriptNames.add(s.getName());
        }
        return executedScriptNames;
    }

    private Map<String, String> readAllScripts(List<Resource> resources) throws IOException
    {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        for (Resource r : resources)
        {
            String scriptName = r.getFilename();
            String script = getResourceContent(r);
            script = appendFunctionBody(script);
            hashMap.put(scriptName, script);
        }
        return hashMap;
    }

    protected String getResourceContent(Resource r) throws IOException
    {
        try (InputStream is = r.getInputStream())
        {
            return IOUtils.toString(is, StandardCharsets.UTF_8);
        }
    }

    private String appendFunctionBody(String string)
    {
        return "function() {" + string + "}";
    }

    private TreeSet<String> sortScriptNames(Set<String> allScriptNames)
    {
        return new TreeSet<>(allScriptNames);
    }

    private boolean scriptInDatabase(List<String> executedScriptNames, String scriptName)
    {
        return executedScriptNames.contains(scriptName);
    }

    private void execute(MongoTemplate mongoTemplate, String scriptName, String scriptBody)
    {
        log.info("Executing script: " + scriptName + ", " + scriptBody);
        ScriptOperations scriptOps = mongoTemplate.scriptOps();
        scriptOps.execute(new ExecutableMongoScript(scriptBody));
        mongoTemplate.save(new DatabaseScript(scriptName, scriptBody));
        log.info("Done executing script");
    }
}
