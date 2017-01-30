package com.icr.ingest.webservices.nifi.common;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.apache.nifi.web.api.dto.ProcessGroupDTO;
import org.apache.nifi.web.api.dto.RevisionDTO;
import org.apache.nifi.web.api.entity.FlowEntity;
import org.apache.nifi.web.api.entity.InstantiateTemplateRequestEntity;
import org.apache.nifi.web.api.entity.ProcessGroupEntity;
import org.apache.nifi.web.api.entity.TemplateEntity;
import org.apache.nifi.web.api.entity.TemplatesEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.icr.ingest.webservices.nifi.NifiRestHandler;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

public class NifiRestUtils
{

    private static final Logger log = LoggerFactory.getLogger(NifiRestUtils.class);
    private final String nifiServer;
    private final NifiRestHandler handler;
    private final RevisionDTO revision;

    /**
     * Creates a new instance. Each instance maintains a internal revision. This revision is used for all calls. If you
     * want a new revision then instantiate a new instance of this class.
     * 
     * @param handler
     * @param nifiServer
     */
    public NifiRestUtils(NifiRestHandler handler, String nifiServer)
    {
        this.handler = handler;
        this.nifiServer = nifiServer;
        revision = new RevisionDTO();
        revision.setClientId(UUID.randomUUID().toString());
        revision.setVersion(0L);
    }

    public TemplateEntity findTemplate(String name) throws Exception
    {
        TemplatesEntity te = handler.get(getRestUrl(NifiEndPoints.GET_TEMPLATES), TemplatesEntity.class);
        for (TemplateEntity template : te.getTemplates())
        {
            if (template.getTemplate().getName().equals(name))
            {
                return template;

            }
        }
        return null;
    }

    public ProcessGroupEntity getProcessGroup(String id) throws Exception
    {
        return handler.get(getRestUrl(NifiEndPoints.GET_PROCESS_GROUP, id), ProcessGroupEntity.class);
    }

    public ProcessGroupEntity deleteProcessGroup(String id) throws Exception
    {
        ProcessGroupEntity processGroup = getProcessGroup(id);
        return handler.delete(getRestUrl(NifiEndPoints.DELETE_PROCESS_GROUP, id),
                addParamToMap(null, "version", processGroup.getRevision().getVersion().toString()),
                ProcessGroupEntity.class);
    }

    private Map<String, String> addParamToMap(Map<String, String> paramMap, String key, String value)
    {
        Map<String, String> retMap = paramMap == null ? new HashMap<>() : paramMap;

        retMap.put(key, value);

        return retMap;
    }

    public ProcessGroupEntity createProcessGroup(String processGroupName) throws Exception
    {
        ProcessGroupEntity newProcessGroup = new ProcessGroupEntity();
        ProcessGroupDTO component = new ProcessGroupDTO();
        component.setName(processGroupName);
        newProcessGroup.setComponent(component);
        newProcessGroup.setRevision(revision);
        ProcessGroupEntity rootGroup = getProcessGroup("root");
        return handler.post(getRestUrl(NifiEndPoints.CREATE_PROCESS_GROUP, rootGroup.getComponent().getId()),
                newProcessGroup, ProcessGroupEntity.class);
    }

    public FlowEntity createFlow(String processGroupId, String templateId) throws Exception
    {
        InstantiateTemplateRequestEntity newTemplateRequest = new InstantiateTemplateRequestEntity();
        newTemplateRequest.setTemplateId(templateId);
        newTemplateRequest.setOriginX(0d);
        newTemplateRequest.setOriginY(0d);
        return handler.post(getRestUrl(NifiEndPoints.INSTANTIATE_TEMPLATE, processGroupId),
                newTemplateRequest, FlowEntity.class);
    }

    private String getRestUrl(String endpoint, Object... formatArgs)
    {
        return String.format(nifiServer + endpoint, formatArgs);
    }

    public void uploadTemplates()
    {
        try
        {
            ProcessGroupEntity rootGroup = getProcessGroup("root");
            Set<String> currentTemplateNames = handler.get(getRestUrl(NifiEndPoints.GET_TEMPLATES), TemplatesEntity.class).getTemplates()
                    .stream()
                    .map(te -> te.getTemplate().getName().replaceAll(" ", "_") + "_Template.xml")
                    .collect(Collectors.toSet());
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resources;
            resources = resolver.getResources("classpath*:templates/*.xml");
            for (Resource resource : resources)
            {
                if (currentTemplateNames.contains(resource.getFilename()))
                {
                    log.info(resource.getFilename() + " already uploaded, skipping...");
                } else
                {
                    File tmp = new File(System.getProperty("java.io.tmpdir"), resource.getFilename());
                    IOUtils.copy(resource.getInputStream(), new FileOutputStream(tmp));
                    FormDataMultiPart formDataMultiPart = new FormDataMultiPart();
                    formDataMultiPart.bodyPart(new FileDataBodyPart("template", tmp));
                    handler.postMultiPart(getRestUrl(NifiEndPoints.UPLOAD_TEMPLATE, rootGroup.getId()), formDataMultiPart, String.class);
                    log.info(resource.getFilename() + " uploaded.");
                    tmp.delete();
                }
            }
        } catch (Exception ex)
        {
            log.warn("Problem uploading templates.", ex);
        }
    }
}
