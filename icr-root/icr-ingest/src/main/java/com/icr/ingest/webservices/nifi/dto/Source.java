
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "groupId",
    "name",
    "running",
    "transmitting",
    "exists",
    "comments"
})
public class Source {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("groupId")
    private String groupId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("running")
    private Boolean running;
    @JsonProperty("transmitting")
    private Boolean transmitting;
    @JsonProperty("exists")
    private Boolean exists;
    @JsonProperty("comments")
    private String comments;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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

    @JsonProperty("running")
    public Boolean getRunning() {
        return running;
    }

    @JsonProperty("running")
    public void setRunning(Boolean running) {
        this.running = running;
    }

    @JsonProperty("transmitting")
    public Boolean getTransmitting() {
        return transmitting;
    }

    @JsonProperty("transmitting")
    public void setTransmitting(Boolean transmitting) {
        this.transmitting = transmitting;
    }

    @JsonProperty("exists")
    public Boolean getExists() {
        return exists;
    }

    @JsonProperty("exists")
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

}
