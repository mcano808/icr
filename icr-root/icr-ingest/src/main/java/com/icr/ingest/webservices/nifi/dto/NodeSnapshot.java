
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nodeId",
    "address",
    "apiPort",
    "statusSnapshot"
})
public class NodeSnapshot {

    @JsonProperty("nodeId")
    private String nodeId;
    @JsonProperty("address")
    private String address;
    @JsonProperty("apiPort")
    private Integer apiPort;
    @JsonProperty("statusSnapshot")
    private StatusSnapshot statusSnapshot;

    @JsonProperty("nodeId")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("nodeId")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("apiPort")
    public Integer getApiPort() {
        return apiPort;
    }

    @JsonProperty("apiPort")
    public void setApiPort(Integer apiPort) {
        this.apiPort = apiPort;
    }

    @JsonProperty("statusSnapshot")
    public StatusSnapshot getStatusSnapshot() {
        return statusSnapshot;
    }

    @JsonProperty("statusSnapshot")
    public void setStatusSnapshot(StatusSnapshot statusSnapshot) {
        this.statusSnapshot = statusSnapshot;
    }

}
