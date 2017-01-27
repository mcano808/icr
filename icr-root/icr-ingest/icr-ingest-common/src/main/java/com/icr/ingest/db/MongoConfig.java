package com.icr.ingest.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * Configuration for the MongoDB database.
 * 
 * @author Leandro Baltazar, cronn GmbH
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration
{
    @Autowired
    private Environment env;

    @Override
    protected String getDatabaseName()
    {
        return env.getProperty("spring.data.mongodb.database", "test");
    }

    @Override
    public Mongo mongo() throws Exception
    {
        return new MongoClient(env.getProperty("spring.data.mongodb.host", "localhost"), env.getProperty("spring.data.mongodb.port", Integer.class, 27017));
    }

    @Override
    public MongoTemplate mongoTemplate() throws Exception
    {
        return new MongoTemplate(mongo(), getDatabaseName());
    }
}
