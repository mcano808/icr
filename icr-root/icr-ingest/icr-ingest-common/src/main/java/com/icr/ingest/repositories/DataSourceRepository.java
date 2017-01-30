package com.icr.ingest.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.DataSource;

/**
 * Repository for retrieving data source definitions
 *
 */
@RepositoryRestResource(collectionResourceRel = "dataSources", path = "dataSources")
public interface DataSourceRepository extends MongoRepository<DataSource, String>
{

    List<DataSource> findByName(@Param("name") String name);

}
