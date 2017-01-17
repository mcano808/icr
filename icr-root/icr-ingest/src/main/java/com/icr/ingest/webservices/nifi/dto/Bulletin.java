
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "groupId",
    "sourceId",
    "timestamp",
    "nodeAddress",
    "canRead",
    "bulletin"
})
public class Bulletin {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("groupId")
    private String groupId;
    @JsonProperty("sourceId")
    private String sourceId;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("nodeAddress")
    private String nodeAddress;
    @JsonProperty("canRead")
    private Boolean canRead;
    @JsonProperty("bulletin")
    private Bulletin bulletin;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
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

    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("nodeAddress")
    public String getNodeAddress() {
        return nodeAddress;
    }

    @JsonProperty("nodeAddress")
    public void setNodeAddress(String nodeAddress) {
        this.nodeAddress = nodeAddress;
    }

    @JsonProperty("canRead")
    public Boolean getCanRead() {
        return canRead;
    }

    @JsonProperty("canRead")
    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    @JsonProperty("bulletin")
    public Bulletin getBulletin() {
        return bulletin;
    }

    @JsonProperty("bulletin")
    public void setBulletin(Bulletin bulletin) {
        this.bulletin = bulletin;
    }

}
