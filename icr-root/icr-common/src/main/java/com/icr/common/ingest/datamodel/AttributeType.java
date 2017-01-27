package com.icr.common.ingest.datamodel;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeType
{
    @Id
    private String id;
    private String name;
    private String description;
    private DataType dataType;
    private boolean unique;

    public AttributeType()
    {
        // Intentionally left blank
    }

    public AttributeType(@JsonProperty("name") String name, @JsonProperty("description") String description,
            @JsonProperty("dataType") DataType dataType, @JsonProperty("unique") boolean unique)
    {
        super();
        this.name = name;
        this.description = description;
        this.dataType = dataType;
        this.unique = unique;
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

    public DataType getDataType()
    {
        return dataType;
    }

    public void setDataType(DataType dataType)
    {
        this.dataType = dataType;
    }

    public boolean isUnique()
    {
        return unique;
    }

    public void setUnique(boolean unique)
    {
        this.unique = unique;
    }

}
