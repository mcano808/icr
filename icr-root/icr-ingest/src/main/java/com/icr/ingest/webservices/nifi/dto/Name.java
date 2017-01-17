
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "defaultValue",
    "allowableValues",
    "required",
    "sensitive",
    "dynamic",
    "supportsEl",
    "identifiesControllerService"
})
public class Name {

    @JsonProperty("name")
    private String name;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("defaultValue")
    private String defaultValue;
    @JsonProperty("allowableValues")
    private List<AllowableValue> allowableValues = new ArrayList<AllowableValue>();
    @JsonProperty("required")
    private Boolean required;
    @JsonProperty("sensitive")
    private Boolean sensitive;
    @JsonProperty("dynamic")
    private Boolean dynamic;
    @JsonProperty("supportsEl")
    private Boolean supportsEl;
    @JsonProperty("identifiesControllerService")
    private String identifiesControllerService;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("defaultValue")
    public String getDefaultValue() {
        return defaultValue;
    }

    @JsonProperty("defaultValue")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @JsonProperty("allowableValues")
    public List<AllowableValue> getAllowableValues() {
        return allowableValues;
    }

    @JsonProperty("allowableValues")
    public void setAllowableValues(List<AllowableValue> allowableValues) {
        this.allowableValues = allowableValues;
    }

    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    @JsonProperty("sensitive")
    public Boolean getSensitive() {
        return sensitive;
    }

    @JsonProperty("sensitive")
    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    @JsonProperty("dynamic")
    public Boolean getDynamic() {
        return dynamic;
    }

    @JsonProperty("dynamic")
    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    @JsonProperty("supportsEl")
    public Boolean getSupportsEl() {
        return supportsEl;
    }

    @JsonProperty("supportsEl")
    public void setSupportsEl(Boolean supportsEl) {
        this.supportsEl = supportsEl;
    }

    @JsonProperty("identifiesControllerService")
    public String getIdentifiesControllerService() {
        return identifiesControllerService;
    }

    @JsonProperty("identifiesControllerService")
    public void setIdentifiesControllerService(String identifiesControllerService) {
        this.identifiesControllerService = identifiesControllerService;
    }

}
