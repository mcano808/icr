package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSource
{
    @Id
    private String id;
    private String name;
    private String project;
    private DataSourceType dataSourceType;
    private List<AttributeMapping> attributeMappings = new ArrayList<>();
    private String groupId;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public DataSourceType getDataSourceType()
    {
        return dataSourceType;
    }

    public void setDataSourceType(DataSourceType dataSourceType)
    {
        this.dataSourceType = dataSourceType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getProject()
    {
        return project;
    }

    public void setProject(String project)
    {
        this.project = project;
    }

    public List<AttributeMapping> getAttributeMappings()
    {
        return attributeMappings;
    }

    public void setAttributeMappings(List<AttributeMapping> attributeMappings)
    {
        this.attributeMappings = attributeMappings;
    }

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

}
