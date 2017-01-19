package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown=true)
public class AttributeMapping
{
    private String originalAttribute;
    private String newAttribute;
    private AttributeType attributeType;
    private DataType dataType;
    private List<String> formatters = new ArrayList<>();
    private List<Transformer> transformers = new ArrayList<>();
    private Map<String, Object> properties = new HashMap<>();
    
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
    public DataType getDataType()
    {
        return dataType;
    }
    public void setDataType(DataType dataType)
    {
        this.dataType = dataType;
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
        
}
