
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "connectionStatusSnapshots",
    "processorStatusSnapshots",
    "processGroupStatusSnapshots",
    "remoteProcessGroupStatusSnapshots",
    "inputPortStatusSnapshots",
    "outputPortStatusSnapshots",
    "flowFilesIn",
    "bytesIn",
    "input",
    "flowFilesQueued",
    "bytesQueued",
    "queued",
    "queuedCount",
    "queuedSize",
    "bytesRead",
    "read",
    "bytesWritten",
    "written",
    "flowFilesOut",
    "bytesOut",
    "output",
    "flowFilesTransferred",
    "bytesTransferred",
    "transferred",
    "bytesReceived",
    "flowFilesReceived",
    "received",
    "bytesSent",
    "flowFilesSent",
    "sent",
    "activeThreadCount"
})
public class StatusSnapshot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("connectionStatusSnapshots")
    private List<ConnectionStatusSnapshot> connectionStatusSnapshots = new ArrayList<ConnectionStatusSnapshot>();
    @JsonProperty("processorStatusSnapshots")
    private List<ProcessorStatusSnapshot> processorStatusSnapshots = new ArrayList<ProcessorStatusSnapshot>();
    @JsonProperty("processGroupStatusSnapshots")
    private List<ProcessGroupStatusSnapshot> processGroupStatusSnapshots = new ArrayList<ProcessGroupStatusSnapshot>();
    @JsonProperty("remoteProcessGroupStatusSnapshots")
    private List<RemoteProcessGroupStatusSnapshot> remoteProcessGroupStatusSnapshots = new ArrayList<RemoteProcessGroupStatusSnapshot>();
    @JsonProperty("inputPortStatusSnapshots")
    private List<InputPortStatusSnapshot> inputPortStatusSnapshots = new ArrayList<InputPortStatusSnapshot>();
    @JsonProperty("outputPortStatusSnapshots")
    private List<OutputPortStatusSnapshot> outputPortStatusSnapshots = new ArrayList<OutputPortStatusSnapshot>();
    @JsonProperty("flowFilesIn")
    private Integer flowFilesIn;
    @JsonProperty("bytesIn")
    private Integer bytesIn;
    @JsonProperty("input")
    private String input;
    @JsonProperty("flowFilesQueued")
    private Integer flowFilesQueued;
    @JsonProperty("bytesQueued")
    private Integer bytesQueued;
    @JsonProperty("queued")
    private String queued;
    @JsonProperty("queuedCount")
    private String queuedCount;
    @JsonProperty("queuedSize")
    private String queuedSize;
    @JsonProperty("bytesRead")
    private Integer bytesRead;
    @JsonProperty("read")
    private String read;
    @JsonProperty("bytesWritten")
    private Integer bytesWritten;
    @JsonProperty("written")
    private String written;
    @JsonProperty("flowFilesOut")
    private Integer flowFilesOut;
    @JsonProperty("bytesOut")
    private Integer bytesOut;
    @JsonProperty("output")
    private String output;
    @JsonProperty("flowFilesTransferred")
    private Integer flowFilesTransferred;
    @JsonProperty("bytesTransferred")
    private Integer bytesTransferred;
    @JsonProperty("transferred")
    private String transferred;
    @JsonProperty("bytesReceived")
    private Integer bytesReceived;
    @JsonProperty("flowFilesReceived")
    private Integer flowFilesReceived;
    @JsonProperty("received")
    private String received;
    @JsonProperty("bytesSent")
    private Integer bytesSent;
    @JsonProperty("flowFilesSent")
    private Integer flowFilesSent;
    @JsonProperty("sent")
    private String sent;
    @JsonProperty("activeThreadCount")
    private Integer activeThreadCount;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("connectionStatusSnapshots")
    public List<ConnectionStatusSnapshot> getConnectionStatusSnapshots() {
        return connectionStatusSnapshots;
    }

    @JsonProperty("connectionStatusSnapshots")
    public void setConnectionStatusSnapshots(List<ConnectionStatusSnapshot> connectionStatusSnapshots) {
        this.connectionStatusSnapshots = connectionStatusSnapshots;
    }

    @JsonProperty("processorStatusSnapshots")
    public List<ProcessorStatusSnapshot> getProcessorStatusSnapshots() {
        return processorStatusSnapshots;
    }

    @JsonProperty("processorStatusSnapshots")
    public void setProcessorStatusSnapshots(List<ProcessorStatusSnapshot> processorStatusSnapshots) {
        this.processorStatusSnapshots = processorStatusSnapshots;
    }

    @JsonProperty("processGroupStatusSnapshots")
    public List<ProcessGroupStatusSnapshot> getProcessGroupStatusSnapshots() {
        return processGroupStatusSnapshots;
    }

    @JsonProperty("processGroupStatusSnapshots")
    public void setProcessGroupStatusSnapshots(List<ProcessGroupStatusSnapshot> processGroupStatusSnapshots) {
        this.processGroupStatusSnapshots = processGroupStatusSnapshots;
    }

    @JsonProperty("remoteProcessGroupStatusSnapshots")
    public List<RemoteProcessGroupStatusSnapshot> getRemoteProcessGroupStatusSnapshots() {
        return remoteProcessGroupStatusSnapshots;
    }

    @JsonProperty("remoteProcessGroupStatusSnapshots")
    public void setRemoteProcessGroupStatusSnapshots(List<RemoteProcessGroupStatusSnapshot> remoteProcessGroupStatusSnapshots) {
        this.remoteProcessGroupStatusSnapshots = remoteProcessGroupStatusSnapshots;
    }

    @JsonProperty("inputPortStatusSnapshots")
    public List<InputPortStatusSnapshot> getInputPortStatusSnapshots() {
        return inputPortStatusSnapshots;
    }

    @JsonProperty("inputPortStatusSnapshots")
    public void setInputPortStatusSnapshots(List<InputPortStatusSnapshot> inputPortStatusSnapshots) {
        this.inputPortStatusSnapshots = inputPortStatusSnapshots;
    }

    @JsonProperty("outputPortStatusSnapshots")
    public List<OutputPortStatusSnapshot> getOutputPortStatusSnapshots() {
        return outputPortStatusSnapshots;
    }

    @JsonProperty("outputPortStatusSnapshots")
    public void setOutputPortStatusSnapshots(List<OutputPortStatusSnapshot> outputPortStatusSnapshots) {
        this.outputPortStatusSnapshots = outputPortStatusSnapshots;
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

    @JsonProperty("flowFilesQueued")
    public Integer getFlowFilesQueued() {
        return flowFilesQueued;
    }

    @JsonProperty("flowFilesQueued")
    public void setFlowFilesQueued(Integer flowFilesQueued) {
        this.flowFilesQueued = flowFilesQueued;
    }

    @JsonProperty("bytesQueued")
    public Integer getBytesQueued() {
        return bytesQueued;
    }

    @JsonProperty("bytesQueued")
    public void setBytesQueued(Integer bytesQueued) {
        this.bytesQueued = bytesQueued;
    }

    @JsonProperty("queued")
    public String getQueued() {
        return queued;
    }

    @JsonProperty("queued")
    public void setQueued(String queued) {
        this.queued = queued;
    }

    @JsonProperty("queuedCount")
    public String getQueuedCount() {
        return queuedCount;
    }

    @JsonProperty("queuedCount")
    public void setQueuedCount(String queuedCount) {
        this.queuedCount = queuedCount;
    }

    @JsonProperty("queuedSize")
    public String getQueuedSize() {
        return queuedSize;
    }

    @JsonProperty("queuedSize")
    public void setQueuedSize(String queuedSize) {
        this.queuedSize = queuedSize;
    }

    @JsonProperty("bytesRead")
    public Integer getBytesRead() {
        return bytesRead;
    }

    @JsonProperty("bytesRead")
    public void setBytesRead(Integer bytesRead) {
        this.bytesRead = bytesRead;
    }

    @JsonProperty("read")
    public String getRead() {
        return read;
    }

    @JsonProperty("read")
    public void setRead(String read) {
        this.read = read;
    }

    @JsonProperty("bytesWritten")
    public Integer getBytesWritten() {
        return bytesWritten;
    }

    @JsonProperty("bytesWritten")
    public void setBytesWritten(Integer bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    @JsonProperty("written")
    public String getWritten() {
        return written;
    }

    @JsonProperty("written")
    public void setWritten(String written) {
        this.written = written;
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

    @JsonProperty("flowFilesTransferred")
    public Integer getFlowFilesTransferred() {
        return flowFilesTransferred;
    }

    @JsonProperty("flowFilesTransferred")
    public void setFlowFilesTransferred(Integer flowFilesTransferred) {
        this.flowFilesTransferred = flowFilesTransferred;
    }

    @JsonProperty("bytesTransferred")
    public Integer getBytesTransferred() {
        return bytesTransferred;
    }

    @JsonProperty("bytesTransferred")
    public void setBytesTransferred(Integer bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    @JsonProperty("transferred")
    public String getTransferred() {
        return transferred;
    }

    @JsonProperty("transferred")
    public void setTransferred(String transferred) {
        this.transferred = transferred;
    }

    @JsonProperty("bytesReceived")
    public Integer getBytesReceived() {
        return bytesReceived;
    }

    @JsonProperty("bytesReceived")
    public void setBytesReceived(Integer bytesReceived) {
        this.bytesReceived = bytesReceived;
    }

    @JsonProperty("flowFilesReceived")
    public Integer getFlowFilesReceived() {
        return flowFilesReceived;
    }

    @JsonProperty("flowFilesReceived")
    public void setFlowFilesReceived(Integer flowFilesReceived) {
        this.flowFilesReceived = flowFilesReceived;
    }

    @JsonProperty("received")
    public String getReceived() {
        return received;
    }

    @JsonProperty("received")
    public void setReceived(String received) {
        this.received = received;
    }

    @JsonProperty("bytesSent")
    public Integer getBytesSent() {
        return bytesSent;
    }

    @JsonProperty("bytesSent")
    public void setBytesSent(Integer bytesSent) {
        this.bytesSent = bytesSent;
    }

    @JsonProperty("flowFilesSent")
    public Integer getFlowFilesSent() {
        return flowFilesSent;
    }

    @JsonProperty("flowFilesSent")
    public void setFlowFilesSent(Integer flowFilesSent) {
        this.flowFilesSent = flowFilesSent;
    }

    @JsonProperty("sent")
    public String getSent() {
        return sent;
    }

    @JsonProperty("sent")
    public void setSent(String sent) {
        this.sent = sent;
    }

    @JsonProperty("activeThreadCount")
    public Integer getActiveThreadCount() {
        return activeThreadCount;
    }

    @JsonProperty("activeThreadCount")
    public void setActiveThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
    }

}
