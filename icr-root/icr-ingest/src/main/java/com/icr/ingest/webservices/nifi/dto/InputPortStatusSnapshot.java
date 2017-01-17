
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "portStatusSnapshot",
    "canRead"
})
public class InputPortStatusSnapshot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("portStatusSnapshot")
    private PortStatusSnapshot portStatusSnapshot;
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

    @JsonProperty("portStatusSnapshot")
    public PortStatusSnapshot getPortStatusSnapshot() {
        return portStatusSnapshot;
    }

    @JsonProperty("portStatusSnapshot")
    public void setPortStatusSnapshot(PortStatusSnapshot portStatusSnapshot) {
        this.portStatusSnapshot = portStatusSnapshot;
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
