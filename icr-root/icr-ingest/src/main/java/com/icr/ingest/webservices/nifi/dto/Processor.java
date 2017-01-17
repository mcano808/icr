
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "parentGroupId",
    "position",
    "name",
    "type",
    "state",
    "style",
    "relationships",
    "description",
    "supportsParallelProcessing",
    "supportsEventDriven",
    "supportsBatching",
    "persistsState",
    "restricted",
    "inputRequirement",
    "config",
    "validationErrors"
})
public class Processor {

    @JsonProperty("id")
    private String id;
    @JsonProperty("parentGroupId")
    private String parentGroupId;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("state")
    private String state;
    @JsonProperty("style")
    private Style style;
    @JsonProperty("relationships")
    private List<Relationship> relationships = new ArrayList<Relationship>();
    @JsonProperty("description")
    private String description;
    @JsonProperty("supportsParallelProcessing")
    private Boolean supportsParallelProcessing;
    @JsonProperty("supportsEventDriven")
    private Boolean supportsEventDriven;
    @JsonProperty("supportsBatching")
    private Boolean supportsBatching;
    @JsonProperty("persistsState")
    private Boolean persistsState;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("inputRequirement")
    private String inputRequirement;
    @JsonProperty("config")
    private Config config;
    @JsonProperty("validationErrors")
    private List<String> validationErrors = new ArrayList<String>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("parentGroupId")
    public String getParentGroupId() {
        return parentGroupId;
    }

    @JsonProperty("parentGroupId")
    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("style")
    public Style getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Style style) {
        this.style = style;
    }

    @JsonProperty("relationships")
    public List<Relationship> getRelationships() {
        return relationships;
    }

    @JsonProperty("relationships")
    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("supportsParallelProcessing")
    public Boolean getSupportsParallelProcessing() {
        return supportsParallelProcessing;
    }

    @JsonProperty("supportsParallelProcessing")
    public void setSupportsParallelProcessing(Boolean supportsParallelProcessing) {
        this.supportsParallelProcessing = supportsParallelProcessing;
    }

    @JsonProperty("supportsEventDriven")
    public Boolean getSupportsEventDriven() {
        return supportsEventDriven;
    }

    @JsonProperty("supportsEventDriven")
    public void setSupportsEventDriven(Boolean supportsEventDriven) {
        this.supportsEventDriven = supportsEventDriven;
    }

    @JsonProperty("supportsBatching")
    public Boolean getSupportsBatching() {
        return supportsBatching;
    }

    @JsonProperty("supportsBatching")
    public void setSupportsBatching(Boolean supportsBatching) {
        this.supportsBatching = supportsBatching;
    }

    @JsonProperty("persistsState")
    public Boolean getPersistsState() {
        return persistsState;
    }

    @JsonProperty("persistsState")
    public void setPersistsState(Boolean persistsState) {
        this.persistsState = persistsState;
    }

    @JsonProperty("restricted")
    public Boolean getRestricted() {
        return restricted;
    }

    @JsonProperty("restricted")
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    @JsonProperty("inputRequirement")
    public String getInputRequirement() {
        return inputRequirement;
    }

    @JsonProperty("inputRequirement")
    public void setInputRequirement(String inputRequirement) {
        this.inputRequirement = inputRequirement;
    }

    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    @JsonProperty("validationErrors")
    public List<String> getValidationErrors() {
        return validationErrors;
    }

    @JsonProperty("validationErrors")
    public void setValidationErrors(List<String> validationErrors) {
        this.validationErrors = validationErrors;
    }

}
