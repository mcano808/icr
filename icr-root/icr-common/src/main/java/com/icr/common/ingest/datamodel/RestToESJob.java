package com.icr.common.ingest.datamodel;

import java.util.HashMap;
import java.util.Map;

public class RestToESJob
{
    private Map<String, JobProperty> jobProperties;
    
    private String URL = "url";
    private String ES_INDEX = "elasticsearch_index";
	  
    public RestToESJob()
    {
	jobProperties = new HashMap<>();
	jobProperties.put(URL, new JobProperty(URL, "rest url description", true, DataType.STRING, null));
	jobProperties.put(ES_INDEX, new JobProperty(ES_INDEX, "rest url description", true, DataType.STRING, null));
    }
    
    public JobProperty getUrl()
    {
	return jobProperties.get(URL);
    }
    
    public void setURL(String url)
    {
	
    }
    public JobProperty getElasticSearchIndex()
    {
	return jobProperties.get(ES_INDEX);
    }
}
