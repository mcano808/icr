
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "canRead",
    "canWrite"
})
public class Permissions {

    @JsonProperty("canRead")
    private Boolean canRead;
    @JsonProperty("canWrite")
    private Boolean canWrite;

    @JsonProperty("canRead")
    public Boolean getCanRead() {
        return canRead;
    }

    @JsonProperty("canRead")
    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    @JsonProperty("canWrite")
    public Boolean getCanWrite() {
        return canWrite;
    }

    @JsonProperty("canWrite")
    public void setCanWrite(Boolean canWrite) {
        this.canWrite = canWrite;
    }

}
