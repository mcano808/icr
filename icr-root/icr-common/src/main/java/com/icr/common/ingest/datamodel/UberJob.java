package com.icr.common.ingest.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UberJob
{
    private IngestJob ingestJob;
    private DataSource dataSource;
    private DataStoreJob dataStoreJob;
    public IngestJob getIngestJob()
    {
        return ingestJob;
    }
    public void setIngestJob(IngestJob ingestJob)
    {
        this.ingestJob = ingestJob;
    }
    public DataSource getDataSource()
    {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }
    public DataStoreJob getDataStoreJob()
    {
        return dataStoreJob;
    }
    public void setDataStoreJob(DataStoreJob dataStoreJob)
    {
        this.dataStoreJob = dataStoreJob;
    }    
}
