package com.icr.common.ingest.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonSerialize(using = DataTypeSerializer.class)
//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
//@JsonDeserialize(using = DataTypeDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public enum DataType
{
    STRING, INTEGER, DECIMAL, BOOLEAN, DATE;   
    
}
