
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "groupId",
    "name",
    "comments",
    "concurrentlySchedulableTaskCount",
    "transmitting",
    "useCompression",
    "exists",
    "targetRunning",
    "connected"
})
public class OutputPort {

    @JsonProperty("id")
    private String id;
    @JsonProperty("groupId")
    private String groupId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("concurrentlySchedulableTaskCount")
    private Integer concurrentlySchedulableTaskCount;
    @JsonProperty("transmitting")
    private Boolean transmitting;
    @JsonProperty("useCompression")
    private Boolean useCompression;
    @JsonProperty("exists")
    private Boolean exists;
    @JsonProperty("targetRunning")
    private Boolean targetRunning;
    @JsonProperty("connected")
    private Boolean connected;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("groupId")
    public String getGroupId() {
        return groupId;
    }

    @JsonProperty("groupId")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

    @JsonProperty("concurrentlySchedulableTaskCount")
    public Integer getConcurrentlySchedulableTaskCount() {
        return concurrentlySchedulableTaskCount;
    }

    @JsonProperty("concurrentlySchedulableTaskCount")
    public void setConcurrentlySchedulableTaskCount(Integer concurrentlySchedulableTaskCount) {
        this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    }

    @JsonProperty("transmitting")
    public Boolean getTransmitting() {
        return transmitting;
    }

    @JsonProperty("transmitting")
    public void setTransmitting(Boolean transmitting) {
        this.transmitting = transmitting;
    }

    @JsonProperty("useCompression")
    public Boolean getUseCompression() {
        return useCompression;
    }

    @JsonProperty("useCompression")
    public void setUseCompression(Boolean useCompression) {
        this.useCompression = useCompression;
    }

    @JsonProperty("exists")
    public Boolean getExists() {
        return exists;
    }

    @JsonProperty("exists")
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    @JsonProperty("targetRunning")
    public Boolean getTargetRunning() {
        return targetRunning;
    }

    @JsonProperty("targetRunning")
    public void setTargetRunning(Boolean targetRunning) {
        this.targetRunning = targetRunning;
    }

    @JsonProperty("connected")
    public Boolean getConnected() {
        return connected;
    }

    @JsonProperty("connected")
    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

}
