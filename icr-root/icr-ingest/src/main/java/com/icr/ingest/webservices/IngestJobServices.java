package com.icr.ingest.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.ingest.webservices.nifi.NifiCsvJobBuilder;

@RepositoryRestController
@RequestMapping(value = "/ingestJob")
public class IngestJobServices
{
    @Autowired
    private NifiCsvJobBuilder csvBuilder;

    @RequestMapping(method = RequestMethod.GET, value = "buildIngestJob")
    public @ResponseBody ResponseEntity<Resources<IngestJob>> buildIngestJob()
    {
        try
        {
            csvBuilder.buildJob();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
