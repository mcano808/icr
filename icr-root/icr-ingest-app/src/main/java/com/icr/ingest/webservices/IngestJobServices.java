package com.icr.ingest.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.common.ingest.datamodel.UberJob;
import com.icr.ingest.webservices.nifi.NifiCsvJobBuilder;

@RepositoryRestController
@RequestMapping(value = "/ingestJob")
public class IngestJobServices
{
    @Autowired
    private NifiCsvJobBuilder csvBuilder;

    @RequestMapping(method = RequestMethod.GET, value = "buildCompleteJob")
    public @ResponseBody ResponseEntity<UberJob> buildCompleteJob(@RequestBody UberJob job)
    {
        //Figure out which ingest job type we are dealing with and build a flow for that type.
        switch (job.getIngestJob().getJobType())
        {
            case DROPBOX_CSV:
                //new DropBoxCsvBuilder().
        }
        return null;
    }
}
