package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Job
{
    @Id  
    private String id;
    private String name;
    private String description;
    private List<JobProperty> jobProperties = new ArrayList<>();
    private DataSource dataSource;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public DataSource getDataSource()
    {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }
    public String getId()
    {
        return id;
    }
    public List<JobProperty> getJobProperties()
    {
        return jobProperties;
    }    
}
