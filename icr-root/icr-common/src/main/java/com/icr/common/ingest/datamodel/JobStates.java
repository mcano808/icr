package com.icr.common.ingest.datamodel;

public interface JobStates
{
    /**
     * Entire Job is inactive
     */
    static final int INACTIVE = 0;
    /**
     * Entire Job is active
     */
    static final int ACTIVE = 1;
    
    /**
     * Ingest Job is complete
     */
    static final int INGEST_JOB_COMPLETE = 2;
    
    /**
     * Datasource is complete
     */
    static final int DATASOURCE_COMPLETE = 4;
    
    /**
     * Data store job is complete
     */
    static final int DATASTORE_JOB_COMPLETE = 8;
    
    /**
     * Everyting is complete and valid
     */
    static final int VALID = 16;
}
