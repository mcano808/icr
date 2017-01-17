
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
    "comments",
    "state",
    "persistsState",
    "restricted",
    "properties",
    "descriptors",
    "customUiUrl",
    "annotationData",
    "referencingComponents",
    "validationErrors"
})
public class ControllerService {

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
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("state")
    private String state;
    @JsonProperty("persistsState")
    private Boolean persistsState;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("descriptors")
    private Descriptors descriptors;
    @JsonProperty("customUiUrl")
    private String customUiUrl;
    @JsonProperty("annotationData")
    private String annotationData;
    @JsonProperty("referencingComponents")
    private List<ReferencingComponent> referencingComponents = new ArrayList<ReferencingComponent>();
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

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("descriptors")
    public Descriptors getDescriptors() {
        return descriptors;
    }

    @JsonProperty("descriptors")
    public void setDescriptors(Descriptors descriptors) {
        this.descriptors = descriptors;
    }

    @JsonProperty("customUiUrl")
    public String getCustomUiUrl() {
        return customUiUrl;
    }

    @JsonProperty("customUiUrl")
    public void setCustomUiUrl(String customUiUrl) {
        this.customUiUrl = customUiUrl;
    }

    @JsonProperty("annotationData")
    public String getAnnotationData() {
        return annotationData;
    }

    @JsonProperty("annotationData")
    public void setAnnotationData(String annotationData) {
        this.annotationData = annotationData;
    }

    @JsonProperty("referencingComponents")
    public List<ReferencingComponent> getReferencingComponents() {
        return referencingComponents;
    }

    @JsonProperty("referencingComponents")
    public void setReferencingComponents(List<ReferencingComponent> referencingComponents) {
        this.referencingComponents = referencingComponents;
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
