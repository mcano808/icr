
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "properties",
    "descriptors",
    "schedulingPeriod",
    "schedulingStrategy",
    "executionNode",
    "penaltyDuration",
    "yieldDuration",
    "bulletinLevel",
    "runDurationMillis",
    "concurrentlySchedulableTaskCount",
    "autoTerminatedRelationships",
    "comments",
    "customUiUrl",
    "lossTolerant",
    "annotationData",
    "defaultConcurrentTasks",
    "defaultSchedulingPeriod"
})
public class Config {

    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("descriptors")
    private Descriptors descriptors;
    @JsonProperty("schedulingPeriod")
    private String schedulingPeriod;
    @JsonProperty("schedulingStrategy")
    private String schedulingStrategy;
    @JsonProperty("executionNode")
    private String executionNode;
    @JsonProperty("penaltyDuration")
    private String penaltyDuration;
    @JsonProperty("yieldDuration")
    private String yieldDuration;
    @JsonProperty("bulletinLevel")
    private String bulletinLevel;
    @JsonProperty("runDurationMillis")
    private Integer runDurationMillis;
    @JsonProperty("concurrentlySchedulableTaskCount")
    private Integer concurrentlySchedulableTaskCount;
    @JsonProperty("autoTerminatedRelationships")
    private List<String> autoTerminatedRelationships = new ArrayList<String>();
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("customUiUrl")
    private String customUiUrl;
    @JsonProperty("lossTolerant")
    private Boolean lossTolerant;
    @JsonProperty("annotationData")
    private String annotationData;
    @JsonProperty("defaultConcurrentTasks")
    private DefaultConcurrentTasks defaultConcurrentTasks;
    @JsonProperty("defaultSchedulingPeriod")
    private DefaultSchedulingPeriod defaultSchedulingPeriod;

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("descriptors")
    public Descriptors getDescriptors() {
        return descriptors;
    }

    @JsonProperty("descriptors")
    public void setDescriptors(Descriptors descriptors) {
        this.descriptors = descriptors;
    }

    @JsonProperty("schedulingPeriod")
    public String getSchedulingPeriod() {
        return schedulingPeriod;
    }

    @JsonProperty("schedulingPeriod")
    public void setSchedulingPeriod(String schedulingPeriod) {
        this.schedulingPeriod = schedulingPeriod;
    }

    @JsonProperty("schedulingStrategy")
    public String getSchedulingStrategy() {
        return schedulingStrategy;
    }

    @JsonProperty("schedulingStrategy")
    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    @JsonProperty("executionNode")
    public String getExecutionNode() {
        return executionNode;
    }

    @JsonProperty("executionNode")
    public void setExecutionNode(String executionNode) {
        this.executionNode = executionNode;
    }

    @JsonProperty("penaltyDuration")
    public String getPenaltyDuration() {
        return penaltyDuration;
    }

    @JsonProperty("penaltyDuration")
    public void setPenaltyDuration(String penaltyDuration) {
        this.penaltyDuration = penaltyDuration;
    }

    @JsonProperty("yieldDuration")
    public String getYieldDuration() {
        return yieldDuration;
    }

    @JsonProperty("yieldDuration")
    public void setYieldDuration(String yieldDuration) {
        this.yieldDuration = yieldDuration;
    }

    @JsonProperty("bulletinLevel")
    public String getBulletinLevel() {
        return bulletinLevel;
    }

    @JsonProperty("bulletinLevel")
    public void setBulletinLevel(String bulletinLevel) {
        this.bulletinLevel = bulletinLevel;
    }

    @JsonProperty("runDurationMillis")
    public Integer getRunDurationMillis() {
        return runDurationMillis;
    }

    @JsonProperty("runDurationMillis")
    public void setRunDurationMillis(Integer runDurationMillis) {
        this.runDurationMillis = runDurationMillis;
    }

    @JsonProperty("concurrentlySchedulableTaskCount")
    public Integer getConcurrentlySchedulableTaskCount() {
        return concurrentlySchedulableTaskCount;
    }

    @JsonProperty("concurrentlySchedulableTaskCount")
    public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
        this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    }

    @JsonProperty("autoTerminatedRelationships")
    public List<String> getAutoTerminatedRelationships() {
        return autoTerminatedRelationships;
    }

    @JsonProperty("autoTerminatedRelationships")
    public void setAutoTerminatedRelationships(List<String> autoTerminatedRelationships) {
        this.autoTerminatedRelationships = autoTerminatedRelationships;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("customUiUrl")
    public String getCustomUiUrl() {
        return customUiUrl;
    }

    @JsonProperty("customUiUrl")
    public void setCustomUiUrl(String customUiUrl) {
        this.customUiUrl = customUiUrl;
    }

    @JsonProperty("lossTolerant")
    public Boolean getLossTolerant() {
        return lossTolerant;
    }

    @JsonProperty("lossTolerant")
    public void setLossTolerant(Boolean lossTolerant) {
        this.lossTolerant = lossTolerant;
    }

    @JsonProperty("annotationData")
    public String getAnnotationData() {
        return annotationData;
    }

    @JsonProperty("annotationData")
    public void setAnnotationData(String annotationData) {
        this.annotationData = annotationData;
    }

    @JsonProperty("defaultConcurrentTasks")
    public DefaultConcurrentTasks getDefaultConcurrentTasks() {
        return defaultConcurrentTasks;
    }

    @JsonProperty("defaultConcurrentTasks")
    public void setDefaultConcurrentTasks(DefaultConcurrentTasks defaultConcurrentTasks) {
        this.defaultConcurrentTasks = defaultConcurrentTasks;
    }

    @JsonProperty("defaultSchedulingPeriod")
    public DefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return defaultSchedulingPeriod;
    }

    @JsonProperty("defaultSchedulingPeriod")
    public void setDefaultSchedulingPeriod(DefaultSchedulingPeriod defaultSchedulingPeriod) {
        this.defaultSchedulingPeriod = defaultSchedulingPeriod;
    }

}
