package com.icr.ingest.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.ingest.repositories.IngestJobRepository;

@Component
public class IngestJobSeedData
{
    @Autowired
    private IngestJobRepository repository;
    
    public void populateData()
    {               
        
        try
        {
            ObjectMapper om = new ObjectMapper();            
            repository.deleteAll();
            IngestJob data = om.readValue(Thread.currentThread().getContextClassLoader().
                    getResourceAsStream("seed_data/Dropbox_CSV.json"), IngestJob.class);
            repository.insert(data);            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
