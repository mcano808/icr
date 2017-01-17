
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flow"
})
public class FlowEntity {

    @JsonProperty("flow")
    private Flow flow;

    @JsonProperty("flow")
    public Flow getFlow() {
        return flow;
    }

    @JsonProperty("flow")
    public void setFlow(Flow flow) {
        this.flow = flow;
    }

}
