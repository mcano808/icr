package com.icr.ingest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.icr.ingest.seed.AttributeTypeSeedData;
import com.icr.ingest.seed.IngestJobSeedData;

@SpringBootApplication(exclude =
{ SecurityAutoConfiguration.class })
public class SeedDataApplication
{    
    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(SeedDataApplication.class, args);
        IngestJobSeedData ingestJobSeedData = ctx.getBean(IngestJobSeedData.class);
        AttributeTypeSeedData attrTypeSeedData = ctx.getBean(AttributeTypeSeedData.class);
        
        //Seed the ingest jobs        
        ingestJobSeedData.populateData();
        
        //Seed attribute types
        attrTypeSeedData.populateData();
    }
}
