package com.icr.common.ingest.datamodel;

public class AllowableValue
{
    private String displayName;
    private String value;
    private String description;
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
    public String getDisplayName()
    {
        return displayName;
    }
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }
}
