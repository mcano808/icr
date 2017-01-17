package com.icr.ingest.webservices.nifi;

import java.net.URI;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icr.ingest.webservices.nifi.dto.Component;
import com.icr.ingest.webservices.nifi.dto.InstantiateTemplateRequestEntity;
import com.icr.ingest.webservices.nifi.dto.ProcessGroupEntity;
import com.icr.ingest.webservices.nifi.dto.Revision;

@org.springframework.stereotype.Component
public class NifiCsvJobBuilder
{
    @Autowired
    private RestTemplate restTemplate;
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder)
    {
	return builder.build();
    }
    
//    public void initRestTemplate(RestTemplateBuilder builder)
//    {
//	restTemplate = builder.build();
//    }

    public void buildJob() throws Exception
    {
	//RestTemplate restTemplate = restTemplateBuilder.build();
	//First get the root process group
	ProcessGroupEntity rootGroup = 
		restTemplate.getForObject("http://localhost:8080/nifi-api/process-groups/root", ProcessGroupEntity.class);
	Revision revision = new Revision();
    	revision.setClientId(UUID.randomUUID().toString());
    	revision.setVersion(0);
	Component component = new Component();
	component.setName("TestCSV");	
	ProcessGroupEntity newProcessGroup = new ProcessGroupEntity();
	newProcessGroup.setComponent(component);
	newProcessGroup.setRevision(revision);
	//Create the process group
	newProcessGroup = restTemplate.postForObject(new URI(String.format("http://localhost:8080/nifi-api/process-groups/%s/process-groups", 
		rootGroup.getComponent().getId())), newProcessGroup, ProcessGroupEntity.class);
	
	//Instantiate a template in the new process group
	
	//First get the instance
	
	InstantiateTemplateRequestEntity newTemplate = new InstantiateTemplateRequestEntity();
	
	ObjectMapper mapper = new ObjectMapper();
	mapper.writeValue(System.out, newProcessGroup);
//	restTemplate.put("http://localhost:8080/nifi-api/process-groups/" + pe.getComponent().getId(), pe);
    }
}
