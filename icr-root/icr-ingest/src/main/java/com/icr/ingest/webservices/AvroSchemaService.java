package com.icr.ingest.webservices;

import javax.ws.rs.core.MediaType;

import org.apache.avro.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.icr.common.avro.AvroUtils;
import com.icr.common.ingest.datamodel.DataSource;
import com.icr.ingest.repositories.DataSourceRepository;

@RestController
@RequestMapping(value = "/avro")
public class AvroSchemaService {

  @Autowired
  DataSourceRepository dsRepository;
  
  // SLF4J LOGGER 
  private static final Logger logger = LoggerFactory.getLogger(AvroSchemaService.class);
  
  /**
   * Utilizes AvroUtils to generate an avro schema, json string. 
   * @param id
   * @return
   */
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON)
  public @ResponseBody ResponseEntity<String> getAvroSchemaForDataSource(@PathVariable("id") String id) {

    DataSource ds = dsRepository.findOne(id);
    Schema raw = AvroUtils.getDataSourceAvroSchema(ds);
    
    logger.debug("Schema: \n{}\n", raw.toString(true));
    
    return ResponseEntity.ok(raw.toString());
  }

}
