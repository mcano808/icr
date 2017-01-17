
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "remoteProcessGroupStatusSnapshot",
    "canRead"
})
public class RemoteProcessGroupStatusSnapshot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("remoteProcessGroupStatusSnapshot")
    private RemoteProcessGroupStatusSnapshot remoteProcessGroupStatusSnapshot;
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

    @JsonProperty("remoteProcessGroupStatusSnapshot")
    public RemoteProcessGroupStatusSnapshot getRemoteProcessGroupStatusSnapshot() {
        return remoteProcessGroupStatusSnapshot;
    }

    @JsonProperty("remoteProcessGroupStatusSnapshot")
    public void setRemoteProcessGroupStatusSnapshot(RemoteProcessGroupStatusSnapshot remoteProcessGroupStatusSnapshot) {
        this.remoteProcessGroupStatusSnapshot = remoteProcessGroupStatusSnapshot;
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
