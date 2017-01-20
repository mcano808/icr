package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeMapping
{
    private String originalAttribute;
    private String newAttribute;
    private AttributeType attributeType;
    private List<String> formatters = new ArrayList<>();
    private List<Transformer> transformers = new ArrayList<>();
    private Map<String, Object> properties = new HashMap<>();

    public AttributeMapping() {
    	// Intentionally left blank
    }
    
    public AttributeMapping(String originalAttribute, String newAttribute, AttributeType attributeType,
			List<String> formatters, List<Transformer> transformers,
			Map<String, Object> properties) {
		this.originalAttribute = originalAttribute;
		this.newAttribute = newAttribute;
		this.attributeType = attributeType;
		this.formatters = formatters;
		this.transformers = transformers;
		this.properties = properties;
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

}
