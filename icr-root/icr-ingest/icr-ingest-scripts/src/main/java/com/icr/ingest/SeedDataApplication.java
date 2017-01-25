package com.icr.ingest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.icr.ingest.seed.IngestJobSeedData;

@SpringBootApplication(exclude =
{ SecurityAutoConfiguration.class })
public class SeedDataApplication
{    
    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(SeedDataApplication.class, args);
        IngestJobSeedData ingestJobSeedData = ctx.getBean(IngestJobSeedData.class);
        
        //Seed the ingest jobs        
        ingestJobSeedData.populateIngestJobs();
        
        //TODO: Other seeding to follow
    }
}
