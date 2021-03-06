package com.icr.common.ingest.datamodel;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeometryType
{
    @Id
    private String id;
    private String name;
    private String description;

    public GeometryType(@JsonProperty("name") String name, @JsonProperty("description") String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getId()
    {
        return id;
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

}
