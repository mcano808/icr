package com.icr.common.ingest.datamodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataStoreJob
{
    @Id
    private String id;
    private String name;
    private String description;
    private List<JobProperty> jobProperties = new ArrayList<>();
    private String groupId;
    private String dataSourceId;
    private int state;

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

    public String getGroupId()
    {
        return groupId;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public void setDataSourceId(String dataSourceId)
    {
        this.dataSourceId = dataSourceId;
    }

    public String getId()
    {
        return id;
    }

    public List<JobProperty> getJobProperties()
    {
        return jobProperties;
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
