package com.icr.ingest.webservices.nifi.ingest;

import org.apache.nifi.web.api.entity.FlowEntity;

import com.icr.common.ingest.datamodel.UberJob;

public interface FlowBuilder
{
    public FlowEntity buildIngestFlow(UberJob uberJob) throws Exception;
}
