package com.icr.common.ingest.datamodel;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class DataTypeSerializer extends StdSerializer<DataType>
{   
    private static final long serialVersionUID = 1L;

    protected DataTypeSerializer(JavaType type)
    {
        super(type);
    }

    @Override
    public void serialize(DataType value, JsonGenerator gen, SerializerProvider provider) throws IOException
    {
        gen.writeStartObject();
        gen.writeString(value.toString());
        gen.writeEndObject();        
    }

}
