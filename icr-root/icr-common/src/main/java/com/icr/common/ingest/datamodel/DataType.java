package com.icr.common.ingest.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum DataType
{
    STRING,
    INTEGER,
    DECIMAL,
    BOOLEAN,
    DATE,
    ENUM;

}
