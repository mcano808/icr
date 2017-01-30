package com.icr.ingest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.IngestJob;

/**
 * Repository for retrieving ingest job definitions
 *
 */
@RepositoryRestResource(collectionResourceRel = "ingestJobs", path = "ingestJobs")
public interface IngestJobRepository extends MongoRepository<IngestJob, String>
{
    IngestJob findById(@Param("id") String id);

    IngestJob findByName(@Param("name") String name);
}
