package com.icr.ingest.seed;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icr.common.ingest.datamodel.AttributeType;
import com.icr.common.ingest.datamodel.DataType;
import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.ingest.repositories.AttributeTypeRepository;
import com.icr.ingest.repositories.DataTypeWrapperRepository;
import com.icr.ingest.repositories.IngestJobRepository;

@Component
public class IngestJobSeedData
{
    @Autowired
    private IngestJobRepository repository;
    
    @Autowired
    private AttributeTypeRepository dtRepo;
    
    public void populateData()
    {               
        
        try
        {
            ObjectMapper om = new ObjectMapper();
            om.writeValue(System.out, DataType.values());
            dtRepo.findAll();
            //dtRepo.save(Arrays.asList(DataType.values()));
//            List<AttributeType> data = om.readValue(Thread.currentThread().getContextClassLoader().
//                    getResourceAsStream("seed_data/AttributeTypes.json"), new TypeReference<List<AttributeType>>(){});
//            repository.deleteAll();
//            IngestJob data = om.readValue(Thread.currentThread().getContextClassLoader().
//                    getResourceAsStream("seed_data/Dropbox_CSV.json"), IngestJob.class);
//            repository.insert(data);            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
