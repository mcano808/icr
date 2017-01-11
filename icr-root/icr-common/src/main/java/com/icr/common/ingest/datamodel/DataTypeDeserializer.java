package com.icr.common.ingest.datamodel;

import java.io.IOException;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;

public class DataTypeDeserializer extends StdDeserializer<DataType>
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public DataTypeDeserializer()
    {
	this(DataType.class);
    }
    
    public DataTypeDeserializer(Class<?> vc)
    {
	super(vc);
	// TODO Auto-generated constructor stub
    }

    @Override
    public DataType deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
    {
	 JsonNode node = jp.getCodec().readTree(jp);
	        int id = (Integer) ((IntNode) node.get("name")).numberValue();
	        String itemName = node.get("itemName").asText();
	        int userId = (Integer) ((IntNode) node.get("createdBy")).numberValue();
	 return null;
    }

   

}
