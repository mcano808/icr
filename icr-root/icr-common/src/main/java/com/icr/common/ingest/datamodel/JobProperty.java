package com.icr.common.ingest.datamodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JobProperty
{
    private final String name;
    private final String description;
    private final boolean required;
    private final DataType type;
    private final String group;
    private final String subGroup;
    private final Object defaultValue;
    private final String reference;
    private List<AllowableValue> allowableValues;

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

    public List<AllowableValue> getAllowableValues()
    {
        return allowableValues;
    }

    public void setAllowableValues(List<AllowableValue> allowableValues)
    {
        this.allowableValues = allowableValues;
    }

}
