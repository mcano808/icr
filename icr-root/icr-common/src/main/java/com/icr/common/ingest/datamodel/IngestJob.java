package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IngestJob
{
    @Id
    private String id;
    private IngestJobType jobType;
    private String name;
    private String description;
    private List<JobProperty> jobProperties = new ArrayList<>();
    private String dataSourceId;
    private String groupId;
    private int state;

    public String getId()
    {
        return id;
    }

    public IngestJobType getJobType()
    {
        return jobType;
    }

    public void setJobType(IngestJobType jobType)
    {
        this.jobType = jobType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDataSourceId()
    {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId)
    {
        this.dataSourceId = dataSourceId;
    }

    public List<JobProperty> getJobProperties()
    {
        return jobProperties;
    }  

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    /**
     * A Bitmask represented by {@link JobStates}
     * @return
     */
    public int getState()
    {
        return state;
    }

    /**
     * Set as a bit mask of {@link JobStates}
     * @param state
     */
    public void setState(int state)
    {
        this.state = state;
    }

   

}
