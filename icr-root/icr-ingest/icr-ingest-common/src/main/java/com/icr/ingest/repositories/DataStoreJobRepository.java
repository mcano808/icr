package com.icr.ingest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.DataStoreJob;

/**
 * Repository for retrieving data store job definitions
 *
 */
@RepositoryRestResource(collectionResourceRel = "dataStoreJobs", path = "dataStoreJobs")
public interface DataStoreJobRepository extends MongoRepository<DataStoreJob, String>
{

}
