package com.icr.ingest.webservices.nifi;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.nifi.web.api.dto.ProcessGroupDTO;
import org.apache.nifi.web.api.dto.RevisionDTO;
import org.apache.nifi.web.api.entity.FlowEntity;
import org.apache.nifi.web.api.entity.InstantiateTemplateRequestEntity;
import org.apache.nifi.web.api.entity.ProcessGroupEntity;
import org.apache.nifi.web.api.entity.TemplateEntity;
import org.apache.nifi.web.api.entity.TemplatesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@org.springframework.stereotype.Component
public class NifiCsvJobBuilder
{
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;
    //
    // @Bean
    // public RestTemplate restTemplate(RestTemplateBuilder builder)
    // {
    // return builder.build();
    // }

    //
    // @Bean
    // public ObjectMapper createObjectMapper()
    // {
    // ObjectMapper objectMapper = new ObjectMapper();
    // objectMapper.setDateFormat(new SimpleDateFormat("HH:mm:ss z"));
    // return objectMapper;
    // }

    @Bean
    public RestTemplate createRestTemplate(RestTemplateBuilder builder, ObjectMapper objectMapper)
    {
        RestTemplate restTemplate = builder.build();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();

        MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
        objectMapper.setDateFormat(new SimpleDateFormat("HH:mm:ss z"));

        jsonMessageConverter.setObjectMapper(objectMapper);
        messageConverters.add(jsonMessageConverter);
        restTemplate.setMessageConverters(messageConverters); // This line was
                                                              // missing, but
                                                              // needs to be
                                                              // here. See
                                                              // answer.
        return restTemplate;
    }

    // public void initRestTemplate(RestTemplateBuilder builder)
    // {
    // restTemplate = builder.build();
    // }

    public void buildJob() throws Exception
    {
        // ObjectMapper mapper = new ObjectMapper();
        // mapper.setDateFormat(new SimpleDateFormat("HH:mm:ss z"));
        // RestTemplate restTemplate = restTemplateBuilder.build();
        // First get the root process group
        ProcessGroupEntity rootGroup = restTemplate.getForObject("http://localhost:8080/nifi-api/process-groups/root",
                ProcessGroupEntity.class);
        RevisionDTO revision = new RevisionDTO();
        revision.setClientId(UUID.randomUUID().toString());
        revision.setVersion(0L);
        ProcessGroupDTO component = new ProcessGroupDTO();
        component.setName("TestCSV");
        ProcessGroupEntity newProcessGroup = new ProcessGroupEntity();
        newProcessGroup.setComponent(component);
        newProcessGroup.setRevision(revision);
        // Create the process group
        newProcessGroup = restTemplate
                .postForObject(new URI(String.format("http://localhost:8080/nifi-api/process-groups/%s/process-groups",
                        rootGroup.getComponent().getId())), newProcessGroup, ProcessGroupEntity.class);

        // Instantiate a template in the new process group

        // First get the instance
        TemplatesEntity templateEntity = restTemplate.getForObject("http://localhost:8080/nifi-api/flow/templates",
                TemplatesEntity.class);

        // TODO look this up via the data model
        TemplateEntity csvTemplate = null;
        for (TemplateEntity template : templateEntity.getTemplates())
        {
            if (template.getTemplate().getName().equals("TestCsvTemplate"))
            {
                csvTemplate = template;
            }
        }
        // InstantiateTemplateRequestEntity newTemplateRequest = new
        // InstantiateTemplateRequestEntity();
        // newTemplateRequest.setTemplateId(csvTemplate.getId());
        // newTemplateRequest.setOriginX(0d);
        // newTemplateRequest.setOriginY(0d);
        //
        // FlowEntity flow =
        // restTemplate.postForObject(String.format("http://localhost:8080/nifi-api/process-groups/%s/template-instance",
        // newProcessGroup.getId()), newTemplateRequest, FlowEntity.class);
        //
        // ObjectMapper mapper = new ObjectMapper();
        // mapper.writeValue(System.out, newProcessGroup);
        // restTemplate.put("http://localhost:8080/nifi-api/process-groups/" +
        // pe.getComponent().getId(), pe);
    }
}
