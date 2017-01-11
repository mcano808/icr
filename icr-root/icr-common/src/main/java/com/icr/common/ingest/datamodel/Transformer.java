package com.icr.common.ingest.datamodel;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Transformer
{
    private String name;
    private Map<String, Object> properties;
    
    public Transformer(@JsonProperty("name") String name, @JsonProperty("properties") Map<String, Object> properties)
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
