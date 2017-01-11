package com.icr.common.ingest.datamodel;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Formatter
{
    private String name;
    private Map<String, Object> properties;
    
    public Formatter(@JsonProperty("name") String name, @JsonProperty("properties") Map<String, Object> properties)
    {
	this.name = name;
	this.properties = properties;	
    }
    public String getName()
    {
        return name;
    }
    
    public Map<String, Object> getProperties()
    {
        return properties;
    }  
    
}
