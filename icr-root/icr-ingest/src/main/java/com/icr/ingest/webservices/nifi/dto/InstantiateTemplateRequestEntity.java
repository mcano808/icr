
package com.icr.ingest.webservices.nifi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "templateId",
    "originX",
    "originY"
})
public class InstantiateTemplateRequestEntity {

    @JsonProperty("templateId")
    private String templateId;
    @JsonProperty("originX")
    private Double originX;
    @JsonProperty("originY")
    private Double originY;

    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @JsonProperty("originX")
    public Double getOriginX() {
        return originX;
    }

    @JsonProperty("originX")
    public void setOriginX(Double originX) {
        this.originX = originX;
    }

    @JsonProperty("originY")
    public Double getOriginY() {
        return originY;
    }

    @JsonProperty("originY")
    public void setOriginY(Double originY) {
        this.originY = originY;
    }

}
