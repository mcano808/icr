package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeMapping
{
    private String originalAttribute;
    private String newAttribute;
    private AttributeType attributeType;
    private List<String> formatters = new ArrayList<>();
    private List<Transformer> transformers = new ArrayList<>();
    private Map<String, Object> properties = new HashMap<>();
    private boolean persisted = true;
    private boolean calculated;

    public AttributeMapping()
    {
        // Intentionally left blank
    }

    public AttributeMapping(@JsonProperty("originalAttribute") String originalAttribute,
            @JsonProperty("newAttribute") String newAttribute,
            @JsonProperty("attributeType") AttributeType attributeType,
            @JsonProperty("formatters") List<String> formatters,
            @JsonProperty("transformers") List<Transformer> transformers,
            @JsonProperty("properties") Map<String, Object> properties, @JsonProperty("persisted") boolean persisted,
            @JsonProperty("calculated") boolean calculated)
    {
        this.originalAttribute = originalAttribute;
        this.newAttribute = newAttribute;
        this.attributeType = attributeType;
        this.formatters = formatters;
        this.transformers = transformers;
        this.properties = properties;
        this.persisted = persisted;
        this.calculated = calculated;
    }

    public String getOriginalAttribute()
    {
        return originalAttribute;
    }

    public void setOriginalAttribute(String originalAttribute)
    {
        this.originalAttribute = originalAttribute;
    }

    public String getNewAttribute()
    {
        return newAttribute;
    }

    public void setNewAttribute(String newAttribute)
    {
        this.newAttribute = newAttribute;
    }

    public AttributeType getAttributeType()
    {
        return attributeType;
    }

    public void setAttributeType(AttributeType attributeType)
    {
        this.attributeType = attributeType;
    }

    public List<String> getFormatters()
    {
        return formatters;
    }

    public List<Transformer> getTransformers()
    {
        return transformers;
    }

    public Map<String, Object> getProperties()
    {
        return properties;
    }

    public boolean isPersisted()
    {
        return persisted;
    }

    public void setPersisted(boolean persisted)
    {
        this.persisted = persisted;
    }

    public boolean isCalculated()
    {
        return calculated;
    }

    public void setCalculated(boolean calculated)
    {
        this.calculated = calculated;
    }

}
