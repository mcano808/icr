package com.icr.common.ingest.datamodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JobProperty
{
    private String name;
    private String description;
    private boolean required;
    private DataType type;
    private String group;
    private String subGroup;
    private Object defaultValue;
    private String reference;
    
    @JsonCreator
    public JobProperty(@JsonProperty("name") String name, @JsonProperty("description") String description,
            @JsonProperty("required") boolean required, @JsonProperty("type") DataType type,
            @JsonProperty("group") String group, @JsonProperty("subGroup") String subGroup,
            @JsonProperty("defaultValue") Object defaultValue,
            @JsonProperty("refrence") String reference)
    {
        this.name = name;
        this.description = description;
        this.required = required;
        this.type = type;
        this.group = group;
        this.subGroup = subGroup;
        this.defaultValue = defaultValue;
        this.reference = reference;
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

    public String getReference()
    {
        return reference;
    }

    public DataType getType()
    {
        return type;
    }

    public String getGroup()
    {
        return group;
    }

    public String getSubGroup()
    {
        return subGroup;
    }

}
