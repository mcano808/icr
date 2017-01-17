
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "connectionStatusSnapshot",
    "canRead"
})
public class ConnectionStatusSnapshot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("connectionStatusSnapshot")
    private ConnectionStatusSnapshot connectionStatusSnapshot;
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

    @JsonProperty("connectionStatusSnapshot")
    public ConnectionStatusSnapshot getConnectionStatusSnapshot() {
        return connectionStatusSnapshot;
    }

    @JsonProperty("connectionStatusSnapshot")
    public void setConnectionStatusSnapshot(ConnectionStatusSnapshot connectionStatusSnapshot) {
        this.connectionStatusSnapshot = connectionStatusSnapshot;
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
