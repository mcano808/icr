package com.icr.common.avro;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.apache.avro.SchemaBuilder.FieldAssembler;

import com.icr.common.ingest.datamodel.AttributeMapping;
import com.icr.common.ingest.datamodel.DataSource;

/**
 * INCOMPLETE - Non-Spring utility class to help generate AVRO schema for
 * Data Sources. 
 * @author Chris Monton
 * @date January 22, 2017
 *
 */
public class AvroUtils {

  public static final String DEFAULT_NAMESPACE = "com.icr.ingest";

  //TODO break this up into multiple methods, will need to check
  //for defaults, complex data types, nested objects, etc.
  public static Schema getDataSourceAvroSchema(DataSource ds) {
    SchemaBuilder.RecordBuilder<Schema> builder =
        SchemaBuilder.record(ds.getName()).namespace(AvroUtils.DEFAULT_NAMESPACE);
    FieldAssembler<Schema> fields = builder.fields();

    for (AttributeMapping mapping : ds.getAttributeMappings()) {
      switch (mapping.getAttributeType().getDataType()) {
        case STRING:
          fields.name(mapping.getNewAttribute()).type().stringType().noDefault();
          break;
        case INTEGER:
        case DATE:
          fields.name(mapping.getNewAttribute()).type().intType().noDefault();
          break;
        case BOOLEAN:
          fields.name(mapping.getNewAttribute()).type().booleanType().noDefault();
          break;
        case DECIMAL:
          fields.name(mapping.getNewAttribute()).type().doubleType().noDefault();
          break;
        default:
          break;
      }
    }

    return fields.endRecord();
  }

}