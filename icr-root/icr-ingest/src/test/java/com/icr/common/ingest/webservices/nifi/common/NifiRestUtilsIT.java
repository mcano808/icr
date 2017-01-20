package com.icr.common.ingest.webservices.nifi.common;

import static org.junit.Assert.assertEquals;

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

}
