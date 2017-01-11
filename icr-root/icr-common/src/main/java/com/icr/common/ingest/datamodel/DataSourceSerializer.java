package com.icr.common.ingest.datamodel;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataSourceSerializer
{
    public static void main(String [] args)
    {
	Transformer trans1 = Factory.getArithmeticTransformer();
	
	Transformer trans2 = Factory.getRegexTransformer();
	
	AttributeMapping attr1 = new AttributeMapping();
	attr1.getTransformers().add(trans1);
	attr1.getTransformers().add(trans2);
	
	AttributeType attrType1 = new AttributeType();
	attrType1.setName("LAT");
	attrType1.setDescription("This is a latitude");
	attrType1.setDataType(DataType.DECIMAL);
	AttributeType attrType2 = new AttributeType();
	attrType2.setName("LON");
	attrType2.setDescription("This is a longitude");
	attrType2.setDataType(DataType.DECIMAL);
	AttributeType attrType3 = new AttributeType();
	attrType3.setName("AFIELD");
	attrType3.setDescription("Field transformation");
	attrType3.setDataType(DataType.STRING);
	attr1.setAttributeType(attrType1);
	attr1.setDataType(DataType.DECIMAL);
	attr1.getFormatters().add(Factory.getDateTransformer());	
	attr1.setNewAttribute("NewVal1");
	attr1.setOriginalAttribute("OrigVal1");
	
	AttributeMapping attr2 = new AttributeMapping();
	attr2.getTransformers().add(trans1);
	attr2.getTransformers().add(trans2);
	
	attr2.setAttributeType(attrType2);
	attr2.setDataType(DataType.DECIMAL);
	attr2.getFormatters().add(Factory.getDateTransformer());	
	attr2.setNewAttribute("NewVal2");
	attr2.setOriginalAttribute("OrigVal2");
	
	DataSource ds = new DataSource();
	ds.setId("1234");
	ds.getAttributeMappings().add(attr1);
	ds.getAttributeMappings().add(attr2);
	
	JobProperty jobProp1 = new JobProperty("prop1", "prop1 description", true, DataType.DECIMAL, 0.0d);
	
	
	JobProperty jobProp2 = new JobProperty("prop2", "Prop2 description", false, DataType.STRING, "abcdefgh");
	
	
	ds.getJobProperties().add(jobProp1);
	ds.getJobProperties().add(jobProp2);
	
	
	ObjectMapper om = new ObjectMapper();
	try
	{
	    om.writeValue(System.out, ds);
	    DataSource ds2 = om.readValue(new File("/home/brautigama/workspace/craig-stuff/src/main/java/com/icr/example/DataSource.json"), DataSource.class);
	    System.out.println(ds2);

	}
	catch (Exception e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();	
	}
	
		
		
    }
}
