package com.icr.common.ingest.datamodel;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JobType
{
    
    private Map<String, Object> jobProperties;
   

    public Map<String, Object> getJobProperties()
    {
        return jobProperties;
    }  
        
}
