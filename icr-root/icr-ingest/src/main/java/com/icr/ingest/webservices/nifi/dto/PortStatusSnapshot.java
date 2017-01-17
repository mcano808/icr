
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "groupId",
    "name",
    "activeThreadCount",
    "flowFilesIn",
    "bytesIn",
    "input",
    "flowFilesOut",
    "bytesOut",
    "output",
    "transmitting",
    "runStatus"
})
public class PortStatusSnapshot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("groupId")
    private String groupId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("activeThreadCount")
    private Integer activeThreadCount;
    @JsonProperty("flowFilesIn")
    private Integer flowFilesIn;
    @JsonProperty("bytesIn")
    private Integer bytesIn;
    @JsonProperty("input")
    private String input;
    @JsonProperty("flowFilesOut")
    private Integer flowFilesOut;
    @JsonProperty("bytesOut")
    private Integer bytesOut;
    @JsonProperty("output")
    private String output;
    @JsonProperty("transmitting")
    private Boolean transmitting;
    @JsonProperty("runStatus")
    private String runStatus;

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

    @JsonProperty("activeThreadCount")
    public Integer getActiveThreadCount() {
        return activeThreadCount;
    }

    @JsonProperty("activeThreadCount")
    public void setActiveThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
    }

    @JsonProperty("flowFilesIn")
    public Integer getFlowFilesIn() {
        return flowFilesIn;
    }

    @JsonProperty("flowFilesIn")
    public void setFlowFilesIn(Integer flowFilesIn) {
        this.flowFilesIn = flowFilesIn;
    }

    @JsonProperty("bytesIn")
    public Integer getBytesIn() {
        return bytesIn;
    }

    @JsonProperty("bytesIn")
    public void setBytesIn(Integer bytesIn) {
        this.bytesIn = bytesIn;
    }

    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    @JsonProperty("flowFilesOut")
    public Integer getFlowFilesOut() {
        return flowFilesOut;
    }

    @JsonProperty("flowFilesOut")
    public void setFlowFilesOut(Integer flowFilesOut) {
        this.flowFilesOut = flowFilesOut;
    }

    @JsonProperty("bytesOut")
    public Integer getBytesOut() {
        return bytesOut;
    }

    @JsonProperty("bytesOut")
    public void setBytesOut(Integer bytesOut) {
        this.bytesOut = bytesOut;
    }

    @JsonProperty("output")
    public String getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(String output) {
        this.output = output;
    }

    @JsonProperty("transmitting")
    public Boolean getTransmitting() {
        return transmitting;
    }

    @JsonProperty("transmitting")
    public void setTransmitting(Boolean transmitting) {
        this.transmitting = transmitting;
    }

    @JsonProperty("runStatus")
    public String getRunStatus() {
        return runStatus;
    }

    @JsonProperty("runStatus")
    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

}
