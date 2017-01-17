
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "parentGroupId",
    "position",
    "name",
    "comments",
    "runningCount",
    "stoppedCount",
    "invalidCount",
    "disabledCount",
    "activeRemotePortCount",
    "inactiveRemotePortCount",
    "inputPortCount",
    "outputPortCount",
    "contents"
})
public class Component {

    @JsonProperty("id")
    private String id;
    @JsonProperty("parentGroupId")
    private String parentGroupId;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("name")
    private String name;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("runningCount")
    private Integer runningCount;
    @JsonProperty("stoppedCount")
    private Integer stoppedCount;
    @JsonProperty("invalidCount")
    private Integer invalidCount;
    @JsonProperty("disabledCount")
    private Integer disabledCount;
    @JsonProperty("activeRemotePortCount")
    private Integer activeRemotePortCount;
    @JsonProperty("inactiveRemotePortCount")
    private Integer inactiveRemotePortCount;
    @JsonProperty("inputPortCount")
    private Integer inputPortCount;
    @JsonProperty("outputPortCount")
    private Integer outputPortCount;
    @JsonProperty("contents")
    private Contents contents;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("parentGroupId")
    public String getParentGroupId() {
        return parentGroupId;
    }

    @JsonProperty("parentGroupId")
    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("runningCount")
    public Integer getRunningCount() {
        return runningCount;
    }

    @JsonProperty("runningCount")
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    @JsonProperty("stoppedCount")
    public Integer getStoppedCount() {
        return stoppedCount;
    }

    @JsonProperty("stoppedCount")
    public void setStoppedCount(Integer stoppedCount) {
        this.stoppedCount = stoppedCount;
    }

    @JsonProperty("invalidCount")
    public Integer getInvalidCount() {
        return invalidCount;
    }

    @JsonProperty("invalidCount")
    public void setInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
    }

    @JsonProperty("disabledCount")
    public Integer getDisabledCount() {
        return disabledCount;
    }

    @JsonProperty("disabledCount")
    public void setDisabledCount(Integer disabledCount) {
        this.disabledCount = disabledCount;
    }

    @JsonProperty("activeRemotePortCount")
    public Integer getActiveRemotePortCount() {
        return activeRemotePortCount;
    }

    @JsonProperty("activeRemotePortCount")
    public void setActiveRemotePortCount(Integer activeRemotePortCount) {
        this.activeRemotePortCount = activeRemotePortCount;
    }

    @JsonProperty("inactiveRemotePortCount")
    public Integer getInactiveRemotePortCount() {
        return inactiveRemotePortCount;
    }

    @JsonProperty("inactiveRemotePortCount")
    public void setInactiveRemotePortCount(Integer inactiveRemotePortCount) {
        this.inactiveRemotePortCount = inactiveRemotePortCount;
    }

    @JsonProperty("inputPortCount")
    public Integer getInputPortCount() {
        return inputPortCount;
    }

    @JsonProperty("inputPortCount")
    public void setInputPortCount(Integer inputPortCount) {
        this.inputPortCount = inputPortCount;
    }

    @JsonProperty("outputPortCount")
    public Integer getOutputPortCount() {
        return outputPortCount;
    }

    @JsonProperty("outputPortCount")
    public void setOutputPortCount(Integer outputPortCount) {
        this.outputPortCount = outputPortCount;
    }

    @JsonProperty("contents")
    public Contents getContents() {
        return contents;
    }

    @JsonProperty("contents")
    public void setContents(Contents contents) {
        this.contents = contents;
    }

}
