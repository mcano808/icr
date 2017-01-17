
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "version",
    "lastModifier"
})
public class Revision {

    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("lastModifier")
    private String lastModifier;

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("lastModifier")
    public String getLastModifier() {
        return lastModifier;
    }

    @JsonProperty("lastModifier")
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

}
