package com.icr.ingest.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.AttributeType;
import com.icr.common.ingest.datamodel.DataSource;

@RepositoryRestResource(collectionResourceRel = "attributeTypes", path = "attributeTypes")
public interface AttributeTypeRepository extends MongoRepository<AttributeType, String>
{
    List<DataSource> findByName(@Param("name") String name);

}
