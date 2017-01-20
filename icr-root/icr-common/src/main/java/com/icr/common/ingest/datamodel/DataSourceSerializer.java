package com.icr.common.ingest.datamodel;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Just for seeing how some of the json objects look. This class is throw away
 *
 */
public class DataSourceSerializer
{
    public static void main(String[] args)
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
        attr1.getFormatters().add("YYYY-MM-dd HH:mm:SS");
        attr1.setNewAttribute("NewVal1");
        attr1.setOriginalAttribute("OrigVal1");

        AttributeMapping attr2 = new AttributeMapping();
        attr2.getTransformers().add(trans1);
        attr2.getTransformers().add(trans2);

        attr2.setAttributeType(attrType2);
        attr2.getFormatters().add("YYYY-MM-dd HH:mm:SS");
        attr2.setNewAttribute("NewVal2");
        attr2.setOriginalAttribute("OrigVal2");

        DataSource ds = new DataSource();
        ds.setId("1234");
        ds.getAttributeMappings().add(attr1);
        ds.getAttributeMappings().add(attr2);

        ds.setDataSourceType(
                new DataSourceType("Discrete Position", "This datasource type has a single defined location."));

        IngestJob job = new IngestJob();
        job.setName("REST to ElasticSearch");
        job.setDescription("A job to ingest data from a restful URL into elasticsearch");
        job.setDataSourceId("1234");
        job.getJobProperties().add(new JobProperty("Schedule", "The schedule in which the job will run", true,
                DataType.STRING, "Group A", "0 0 *"));
        job.getJobProperties().add(new JobProperty("URL", "the url from which to acquire data", true, DataType.INTEGER,
                "Group A", "https://my.stuff.com"));

        ObjectMapper om = new ObjectMapper();
        try
        {
            om.writeValue(System.out, job);
            om.writeValue(new File("/tmp/Job.json"), job);
            IngestJob job2 = om.readValue(new File("/tmp/Job.json"), IngestJob.class);
            System.out.println(job2);

        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
