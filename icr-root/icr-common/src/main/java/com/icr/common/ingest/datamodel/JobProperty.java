package com.icr.common.ingest.datamodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JobProperty
{
    private String name;
    private String description;
    private boolean required;
    private DataType type;
    private Object defaultValue;
    
    @JsonCreator
    public JobProperty(@JsonProperty("name") String name, @JsonProperty("description") String description, @JsonProperty("required") boolean required, @JsonProperty("type") DataType type, 
	    @JsonProperty("defaultValue") Object defaultValue)
    {
	this.name = name;
	this.description = description;
	this.required = required;
	this.type = type;
	this.defaultValue = defaultValue;
    }


    public String getName()
    {
        return name;
    }


    public String getDescription()
    {
        return description;
    }


    public boolean isRequired()
    {
        return required;
    }


    public Object getDefaultValue()
    {
        return defaultValue;
    }


    public DataType getType()
    {
        return type;
    }
    
    
    
   
    
    
}
