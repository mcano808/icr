package com.icr.ingest.webservices.nifi.ingest;

import org.apache.nifi.web.api.entity.FlowEntity;
import org.apache.nifi.web.api.entity.ProcessGroupEntity;
import org.apache.nifi.web.api.entity.TemplateEntity;
import org.springframework.core.env.Environment;

import com.icr.common.ingest.datamodel.DataSource;
import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.common.ingest.datamodel.UberJob;
import com.icr.ingest.webservices.nifi.NifiRestHandler;
import com.icr.ingest.webservices.nifi.common.NifiRestUtils;


public abstract class AbstractFlowBuilder implements FlowBuilder
{
    protected NifiRestHandler handler;

    protected Environment env;
    
    protected String nifiServer;
    
    protected NifiRestUtils utils;
    
    public AbstractFlowBuilder(Environment env, NifiRestHandler handler)
    {
        this.env = env;
        this.handler = handler;
        nifiServer = env.getProperty("nifi.server");
        utils = new NifiRestUtils(handler, nifiServer);
    }
    
    public FlowEntity buildIngestFlow(UberJob uberJob) throws Exception
    {
        //Figure out the template we are to use from nifi
        IngestJob ingestJob = uberJob.getIngestJob();
        DataSource dataSource = uberJob.getDataSource();
        TemplateEntity templateEntity = utils.findTemplate(ingestJob.getName());
              
        //Create a new process group.
        ProcessGroupEntity processsGroup = utils.createProcessGroup(dataSource.getName());        
        
        //Create a flow instance
        FlowEntity flow = utils.createFlow(processsGroup.getId(), templateEntity.getId());
        return buildFlow(flow, uberJob);                
    }
    
    public abstract FlowEntity buildFlow(FlowEntity flow, UberJob uberJob);
}
