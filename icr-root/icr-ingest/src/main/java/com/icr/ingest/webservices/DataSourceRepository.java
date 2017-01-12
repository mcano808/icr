package com.icr.ingest.webservices;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.icr.common.ingest.datamodel.DataSource;


@RepositoryRestResource(collectionResourceRel = "datasource", path = "datasource" )
public interface DataSourceRepository extends MongoRepository<DataSource, String> {

	List<DataSource> findByName(@Param("name") String name);

}
