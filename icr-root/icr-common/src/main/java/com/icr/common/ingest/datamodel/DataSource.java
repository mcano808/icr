package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DataSource
{
    private String id;
    private String name;
    private List<JobProperty> jobProperties = new ArrayList<>();
    private List<AttributeMapping> attributeMappings = new ArrayList<>();
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<AttributeMapping> getAttributeMappings()
    {
        return attributeMappings;
    } 
    public void setAttributeMappings(List<AttributeMapping> attributeMappings)
    {
        this.attributeMappings = attributeMappings;
    }
    public List<JobProperty> getJobProperties()
    {
        return jobProperties;
    }
    public void setJobProperties(List<JobProperty> jobProperties)
    {
        this.jobProperties = jobProperties;
    }
   
    
}
