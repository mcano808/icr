package com.icr.ingest.seed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icr.common.ingest.datamodel.AttributeType;
import com.icr.ingest.repositories.AttributeTypeRepository;

@Component
public class AttributeTypeSeedData
{
    @Autowired
    private AttributeTypeRepository repository;
    
    public void populateData()
    {               
        
        try
        {
            ObjectMapper om = new ObjectMapper();            
            repository.deleteAll();            
            List<AttributeType> data = om.readValue(Thread.currentThread().getContextClassLoader().
                    getResourceAsStream("seed_data/AttributeTypes.json"), new TypeReference<List<AttributeType>>(){});
            repository.insert(data);            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
