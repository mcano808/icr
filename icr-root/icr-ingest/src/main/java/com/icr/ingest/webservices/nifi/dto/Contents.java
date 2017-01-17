
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "processGroups",
    "remoteProcessGroups",
    "processors",
    "inputPorts",
    "outputPorts",
    "connections",
    "labels",
    "funnels",
    "controllerServices"
})
public class Contents {

    @JsonProperty("processGroups")
    //ACB had to modify this as the NIFI Rest API doesn't match what Nifi actually returns back.
    private List<ProcessGroup> processGroups= new ArrayList<ProcessGroup>();
    @JsonProperty("remoteProcessGroups")
    private List<RemoteProcessGroup> remoteProcessGroups = new ArrayList<RemoteProcessGroup>();
    @JsonProperty("processors")
    private List<Processor> processors = new ArrayList<Processor>();
    @JsonProperty("inputPorts")
    private List<InputPort> inputPorts = new ArrayList<InputPort>();
    @JsonProperty("outputPorts")
    private List<OutputPort> outputPorts = new ArrayList<OutputPort>();
    @JsonProperty("connections")
    private List<Connection> connections = new ArrayList<Connection>();
    @JsonProperty("labels")
    private List<Label> labels = new ArrayList<Label>();
    @JsonProperty("funnels")
    private List<Funnel> funnels = new ArrayList<Funnel>();
    @JsonProperty("controllerServices")
    private List<ControllerService> controllerServices = new ArrayList<ControllerService>();

    @JsonProperty("processGroups")
    public List<ProcessGroup> getProcessGroups() {
        return processGroups;
    }

    @JsonProperty("processGroups")
    public void setProcessGroups(List<ProcessGroup> processGroups) {
        this.processGroups = processGroups;
    }

    @JsonProperty("remoteProcessGroups")
    public List<RemoteProcessGroup> getRemoteProcessGroups() {
        return remoteProcessGroups;
    }

    @JsonProperty("remoteProcessGroups")
    public void setRemoteProcessGroups(List<RemoteProcessGroup> remoteProcessGroups) {
        this.remoteProcessGroups = remoteProcessGroups;
    }

    @JsonProperty("processors")
    public List<Processor> getProcessors() {
        return processors;
    }

    @JsonProperty("processors")
    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    @JsonProperty("inputPorts")
    public List<InputPort> getInputPorts() {
        return inputPorts;
    }

    @JsonProperty("inputPorts")
    public void setInputPorts(List<InputPort> inputPorts) {
        this.inputPorts = inputPorts;
    }

    @JsonProperty("outputPorts")
    public List<OutputPort> getOutputPorts() {
        return outputPorts;
    }

    @JsonProperty("outputPorts")
    public void setOutputPorts(List<OutputPort> outputPorts) {
        this.outputPorts = outputPorts;
    }

    @JsonProperty("connections")
    public List<Connection> getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("funnels")
    public List<Funnel> getFunnels() {
        return funnels;
    }

    @JsonProperty("funnels")
    public void setFunnels(List<Funnel> funnels) {
        this.funnels = funnels;
    }

    @JsonProperty("controllerServices")
    public List<ControllerService> getControllerServices() {
        return controllerServices;
    }

    @JsonProperty("controllerServices")
    public void setControllerServices(List<ControllerService> controllerServices) {
        this.controllerServices = controllerServices;
    }

}
