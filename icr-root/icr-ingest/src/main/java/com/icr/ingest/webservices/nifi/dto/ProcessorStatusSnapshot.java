
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "processorStatusSnapshot",
    "canRead"
})
public class ProcessorStatusSnapshot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("processorStatusSnapshot")
    private ProcessorStatusSnapshot processorStatusSnapshot;
    @JsonProperty("canRead")
    private Boolean canRead;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("processorStatusSnapshot")
    public ProcessorStatusSnapshot getProcessorStatusSnapshot() {
        return processorStatusSnapshot;
    }

    @JsonProperty("processorStatusSnapshot")
    public void setProcessorStatusSnapshot(ProcessorStatusSnapshot processorStatusSnapshot) {
        this.processorStatusSnapshot = processorStatusSnapshot;
    }

    @JsonProperty("canRead")
    public Boolean getCanRead() {
        return canRead;
    }

    @JsonProperty("canRead")
    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

}
