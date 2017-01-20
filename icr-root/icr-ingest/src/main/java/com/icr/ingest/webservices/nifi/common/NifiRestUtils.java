package com.icr.ingest.webservices.nifi.common;

import org.apache.nifi.web.api.entity.TemplateEntity;
import org.apache.nifi.web.api.entity.TemplatesEntity;

import com.icr.ingest.webservices.nifi.NifiRestHandler;

public class NifiRestUtils
{
    private String nifiServer;
    private NifiRestHandler handler;

    public NifiRestUtils(NifiRestHandler handler, String nifiServer)
    {
        this.handler = handler;
        this.nifiServer = nifiServer;
    }

    public TemplateEntity findTemplate(String name) throws Exception
    {
        TemplatesEntity te = handler.get(getRestUrl(), TemplatesEntity.class);
        for (TemplateEntity template : te.getTemplates())
        {
            if (template.getTemplate().getName().equals(name))
            {
                return template;

            }
        }
        return null;
    }

    private String getRestUrl()
    {
        return nifiServer + NifiEndPoints.GET_TEMPLATES;
    }
}
