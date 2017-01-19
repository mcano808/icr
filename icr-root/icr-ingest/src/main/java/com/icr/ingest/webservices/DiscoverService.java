package com.icr.ingest.webservices;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icr.common.ingest.datamodel.DataStoreJob;
import com.icr.common.ingest.datamodel.DataType;
import com.icr.common.ingest.datamodel.IngestJob;
import com.icr.common.ingest.datamodel.JobProperty;

@RepositoryRestController
@RequestMapping(value = "/discover")
public class DiscoverService
{

    @RequestMapping(method = RequestMethod.GET, value = "ingestJobs")
    public @ResponseBody ResponseEntity<Resources<IngestJob>> discoverIngestJobs()
    {
        List<IngestJob> jobs = new ArrayList<>();
        IngestJob job = new IngestJob();

        // TODO: Build this up from nifi templates
        // Just some mock up samples
        job.setName("REST URL");
        job.setDescription("A ingest job configuration to ingest data from a restful URL.");
        job.getJobProperties().add(new JobProperty("URL", "Url Description", true, DataType.STRING, "Group A", null));
        job.getJobProperties()
                .add(new JobProperty("Params", "Params Description", true, DataType.STRING, "Group A", null));

        jobs.add(job);
        job = new IngestJob();
        job.setName("File Drop CSV");
        job.setDescription("A file drop box that is csv based data");
        job.getJobProperties()
                .add(new JobProperty("Directory", "Directory Description", true, DataType.STRING, "Group A", null));
        job.getJobProperties()
                .add(new JobProperty("Schedule", "Schedule Description", true, DataType.STRING, "Group A", null));
        jobs.add(job);
        Resources<IngestJob> resources = new Resources<>(jobs);
        resources.add(linkTo(methodOn(DiscoverService.class).discoverIngestJobs()).withSelfRel());
        return ResponseEntity.ok(resources);
    }

    @RequestMapping(method = RequestMethod.GET, value = "dataStoreJobs")
    public @ResponseBody ResponseEntity<Resources<DataStoreJob>> discoverDataStoreJobs()
    {
        List<DataStoreJob> jobs = new ArrayList<>();
        DataStoreJob job = new DataStoreJob();

        // TODO: Build this up from nifi templates
        // Just some mock up samples
        job.setName("ElasticSearchStore");
        job.setDescription("A data store job to persist data into elastic search.");
        jobs.add(job);
        job.getJobProperties()
                .add(new JobProperty("Host", "Host description", true, DataType.STRING, "Group A", "localhost"));
        job.getJobProperties()
                .add(new JobProperty("Port", "Port description", true, DataType.INTEGER, "Group A", 6000));
        jobs.add(job);
        Resources<DataStoreJob> resources = new Resources<>(jobs);
        resources.add(linkTo(methodOn(DiscoverService.class).discoverDataStoreJobs()).withSelfRel());
        return ResponseEntity.ok(resources);
    }

    @RequestMapping(method = RequestMethod.GET, value = "dataTypes")
    public @ResponseBody ResponseEntity<Resources<DataType>> dataTypes()
    {
        Resources<DataType> dataTypes = new Resources<>(Arrays.asList(DataType.values()));
        return ResponseEntity.ok(dataTypes);
    }

}
