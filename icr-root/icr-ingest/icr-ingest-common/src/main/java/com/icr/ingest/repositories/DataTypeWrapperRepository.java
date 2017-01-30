package com.icr.ingest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.DataTypeWrapper;

/**
 * Repository for retrieving attribute type definitions
 *
 */
@RepositoryRestResource(collectionResourceRel = "dataTypes", path = "dataTypes")
public interface DataTypeWrapperRepository extends MongoRepository<DataTypeWrapper, String>
{

}
