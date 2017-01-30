package com.icr.ingest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.GeometryType;

/**
 * Repository for retrieving geometry types
 *
 */
@RepositoryRestResource(collectionResourceRel = "geometryTypes", path = "geometryTypes")
public interface GeometryTypeRepository extends MongoRepository<GeometryType, String>
{

}
