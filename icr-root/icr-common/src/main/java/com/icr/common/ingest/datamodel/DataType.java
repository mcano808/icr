package com.icr.common.ingest.datamodel;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@JsonSerialize(using = DataTypeSerializer.class)
//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
//@JsonDeserialize(using = DataTypeDeserializer.class)
public enum DataType
{
    STRING, INTEGER, DECIMAL, BOOLEAN, DATE;    
}
