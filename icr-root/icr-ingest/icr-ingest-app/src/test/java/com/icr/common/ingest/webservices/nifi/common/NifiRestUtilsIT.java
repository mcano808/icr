package com.icr.common.ingest.webservices.nifi.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.apache.nifi.web.api.entity.FlowEntity;
import org.apache.nifi.web.api.entity.ProcessGroupEntity;
import org.apache.nifi.web.api.entity.TemplateEntity;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icr.ingest.Application;
import com.icr.ingest.webservices.nifi.NifiRestHandler;
import com.icr.ingest.webservices.nifi.common.NifiRestUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes =
{ Application.class })
/**
 * Only used for integration testing
 *
 */
public class NifiRestUtilsIT
{

    @Autowired
    private NifiRestHandler handler;

    @Autowired
    private Environment env;

    private NifiRestUtils utils;

    @Before
    public void init()
    {
        utils = new NifiRestUtils(handler, env.getProperty("nifi.server"));
    }

    @Ignore
    public void testFindTemplate() throws Exception
    {
        TemplateEntity te = utils.findTemplate("Dropbox CSV");
        assertEquals("Dropbox CSV", te.getTemplate().getName());
    }  
    @Ignore
    public void testGetProcessGroup() throws Exception
    {
        assertNotNull(utils.getProcessGroup("root"));
    }
    
    @Ignore
    public void testCreateAndDeleteProcessGroup() throws Exception
    {
        ProcessGroupEntity processGroup = utils.createProcessGroup("TestGroup");
        assertNotNull(processGroup);
        String id = processGroup.getId();
        assertNotNull(id);
        utils.deleteProcessGroup(id);
        try 
        {
            utils.getProcessGroup(id);
            fail("Should not have been able to retrieve process group id:" + id);
        }
        catch (Exception e)
        {
            //Ignore
        }        
    }
    
    @Ignore
    public void testCreateFlow() throws Exception
    {
        ProcessGroupEntity processGroup = utils.createProcessGroup("TestGroup");
        assertNotNull(processGroup);
        
        TemplateEntity te = utils.findTemplate("Dropbox CSV");
        assertNotNull(te);
        
        FlowEntity flow = utils.createFlow(processGroup.getId(), te.getTemplate().getId());
        assertNotNull(flow);
        
        utils.deleteProcessGroup(processGroup.getId());
    }

}
