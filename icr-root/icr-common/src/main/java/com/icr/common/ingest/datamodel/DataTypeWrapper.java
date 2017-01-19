package com.icr.common.ingest.datamodel;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataTypeWrapper
{
    @Id
    private String id;

    private DataType dataType;

    public DataType getDataType()
    {
        return dataType;
    }

    public void setDataType(DataType dataType)
    {
        this.dataType = dataType;
    }

    public String getId()
    {
        return id;
    }

}
