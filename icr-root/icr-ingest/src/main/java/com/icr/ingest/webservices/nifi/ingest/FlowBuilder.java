package com.icr.ingest.webservices.nifi.ingest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.common.ingest.datamodel.UberJob;
import com.icr.ingest.webservices.nifi.NifiRestHandler;

@PropertySource("classpath:ingest.properties")
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FlowBuilder
{
    @Autowired
    private NifiRestHandler handler;

    private String Environment;
    
    private String nifiServer;
    
    public FlowBuilder(@Autowired Environment env)
    {
        nifiServer = env.getProperty("nifi.server");
    }
    public void buildIngestFlow(UberJob uberJob)
    {
        //Figure out the template we are to use from nifi
        IngestJob ingestJob = uberJob.getIngestJob();
        String template = ingestJob.getName();
        
        //Template
        
    }
}
