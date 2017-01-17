
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowableValue",
    "canRead"
})
public class AllowableValue {

    @JsonProperty("allowableValue")
    private AllowableValue allowableValue;
    @JsonProperty("canRead")
    private Boolean canRead;

    @JsonProperty("allowableValue")
    public AllowableValue getAllowableValue() {
        return allowableValue;
    }

    @JsonProperty("allowableValue")
    public void setAllowableValue(AllowableValue allowableValue) {
        this.allowableValue = allowableValue;
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
