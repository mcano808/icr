package com.icr.ingest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.DataSourceType;

/**
 * Repository for retrieving data source types
 *
 */
@RepositoryRestResource(collectionResourceRel = "dataSourceTypes", path = "dataSourceTypes")
public interface DataSourceTypeRepository extends MongoRepository<DataSourceType, String>
{

}
