package com.icr.ingest.webservices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.DataTypeWrapper;

@RepositoryRestResource(collectionResourceRel = "dataTypes", path = "dataTypes" )
public interface DataTypeRepository extends MongoRepository<DataTypeWrapper, String>
{

}
