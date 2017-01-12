package com.icr.ingest.webservices;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.Job;

@RepositoryRestResource(collectionResourceRel = "jobs", path = "jobs")
public interface JobRepository extends MongoRepository<Job, String>
{

    Job findById(@Param("id") String id);   
    Job findByName(@Param("name")String name);
}
