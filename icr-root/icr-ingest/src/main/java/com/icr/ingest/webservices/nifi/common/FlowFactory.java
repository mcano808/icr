package com.icr.ingest.webservices.nifi.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.icr.common.ingest.datamodel.IngestJobType;
import com.icr.ingest.webservices.nifi.NifiRestHandler;
import com.icr.ingest.webservices.nifi.ingest.DropboxCsvBuilder;
import com.icr.ingest.webservices.nifi.ingest.FlowBuilder;

@Component
public class FlowFactory
{
    @Autowired
    private Environment env;
    
    @Autowired
    private NifiRestHandler handler;
    
    public FlowBuilder createFlowBuilder(IngestJobType type)
    {
        switch (type)
        {
            case DROPBOX_CSV:
                return new DropboxCsvBuilder(env, handler);
            default:
                return null;
        }
    }
}
