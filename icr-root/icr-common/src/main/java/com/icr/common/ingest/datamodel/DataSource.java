package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSource
{
    @Id
    private String id;
    private String name;
    private String description;
    private String project;
    private DataSourceType dataSourceType;
    private GeometryType geometryType;
    private List<AttributeMapping> attributeMappings = new ArrayList<>();
    private String groupId;
    private Map<String, Object> properties = new HashMap<>();

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

    public GeometryType getGeometryType()
    {
        return geometryType;
    }

    public void setGeometryType(GeometryType geometryType)
    {
        this.geometryType = geometryType;
    }

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

    public Map<String, Object> getProperties()
    {
        return properties;
    }

}
