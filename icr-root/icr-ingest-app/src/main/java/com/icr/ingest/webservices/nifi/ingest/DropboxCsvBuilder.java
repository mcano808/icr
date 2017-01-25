package com.icr.ingest.webservices.nifi.ingest;

import org.apache.nifi.web.api.entity.FlowEntity;
import org.springframework.core.env.Environment;

import com.icr.common.ingest.datamodel.UberJob;
import com.icr.ingest.webservices.nifi.NifiRestHandler;
import com.icr.ingest.webservices.nifi.common.AbstractFlowBuilder;

public class DropboxCsvBuilder extends AbstractFlowBuilder
{

    public DropboxCsvBuilder(Environment env, NifiRestHandler handler)
    {
        super(env, handler);
    }

    @Override
    public FlowEntity buildFlow(FlowEntity flow, UberJob uberJob)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
