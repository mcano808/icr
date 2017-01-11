package com.icr.common.ingest.datamodel;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class DataTypeSerializer extends StdSerializer<DataType>
{

	private static final long serialVersionUID = 1L;

	public DataTypeSerializer()
	{
	    super(DataType.class);
	}

	public DataTypeSerializer(Class<DataType> t)
	{
	    super(t);
	}

	@Override
	public void serialize(DataType value, JsonGenerator generator, SerializerProvider provider) throws IOException
	{
	    generator.writeStartObject();
	    generator.writeFieldName("name");
	    //generator.writeString(value.getName());
	    generator.writeEndObject();

	}

}