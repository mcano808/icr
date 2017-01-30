package com.icr.common.ingest.datamodel;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class DataTypeDeserializer extends StdDeserializer<DataType>
{
    private static final long serialVersionUID = 1L;

    protected DataTypeDeserializer(JavaType valueType)
    {
        super(valueType);
    }

    @Override
    public DataType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException
    {
        String dataTypeStr = p.getText();
//        for(DataType dataType: DataType.values())
//        {
//            if (dataType.toString().equals(dataTypeStr))
//            {
//                return dataType;
//            }
//        }
        return null;
    }

   

}
