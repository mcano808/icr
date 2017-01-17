
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
    "source",
    "destination",
    "name",
    "labelIndex",
    "getzIndex",
    "selectedRelationships",
    "availableRelationships",
    "backPressureObjectThreshold",
    "backPressureDataSizeThreshold",
    "flowFileExpiration",
    "prioritizers",
    "bends"
})
public class Connection {

    @JsonProperty("id")
    private String id;
    @JsonProperty("parentGroupId")
    private String parentGroupId;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("source")
    private Source source;
    @JsonProperty("destination")
    private Destination destination;
    @JsonProperty("name")
    private String name;
    @JsonProperty("labelIndex")
    private Integer labelIndex;
    @JsonProperty("getzIndex")
    private Integer getzIndex;
    @JsonProperty("selectedRelationships")
    private List<String> selectedRelationships = new ArrayList<String>();
    @JsonProperty("availableRelationships")
    private List<String> availableRelationships = new ArrayList<String>();
    @JsonProperty("backPressureObjectThreshold")
    private Integer backPressureObjectThreshold;
    @JsonProperty("backPressureDataSizeThreshold")
    private String backPressureDataSizeThreshold;
    @JsonProperty("flowFileExpiration")
    private String flowFileExpiration;
    @JsonProperty("prioritizers")
    private List<String> prioritizers = new ArrayList<String>();
    @JsonProperty("bends")
    private List<Bend> bends = new ArrayList<Bend>();

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

    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(Source source) {
        this.source = source;
    }

    @JsonProperty("destination")
    public Destination getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("labelIndex")
    public Integer getLabelIndex() {
        return labelIndex;
    }

    @JsonProperty("labelIndex")
    public void setLabelIndex(Integer labelIndex) {
        this.labelIndex = labelIndex;
    }

    @JsonProperty("getzIndex")
    public Integer getGetzIndex() {
        return getzIndex;
    }

    @JsonProperty("getzIndex")
    public void setGetzIndex(Integer getzIndex) {
        this.getzIndex = getzIndex;
    }

    @JsonProperty("selectedRelationships")
    public List<String> getSelectedRelationships() {
        return selectedRelationships;
    }

    @JsonProperty("selectedRelationships")
    public void setSelectedRelationships(List<String> selectedRelationships) {
        this.selectedRelationships = selectedRelationships;
    }

    @JsonProperty("availableRelationships")
    public List<String> getAvailableRelationships() {
        return availableRelationships;
    }

    @JsonProperty("availableRelationships")
    public void setAvailableRelationships(List<String> availableRelationships) {
        this.availableRelationships = availableRelationships;
    }

    @JsonProperty("backPressureObjectThreshold")
    public Integer getBackPressureObjectThreshold() {
        return backPressureObjectThreshold;
    }

    @JsonProperty("backPressureObjectThreshold")
    public void setBackPressureObjectThreshold(Integer backPressureObjectThreshold) {
        this.backPressureObjectThreshold = backPressureObjectThreshold;
    }

    @JsonProperty("backPressureDataSizeThreshold")
    public String getBackPressureDataSizeThreshold() {
        return backPressureDataSizeThreshold;
    }

    @JsonProperty("backPressureDataSizeThreshold")
    public void setBackPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
        this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
    }

    @JsonProperty("flowFileExpiration")
    public String getFlowFileExpiration() {
        return flowFileExpiration;
    }

    @JsonProperty("flowFileExpiration")
    public void setFlowFileExpiration(String flowFileExpiration) {
        this.flowFileExpiration = flowFileExpiration;
    }

    @JsonProperty("prioritizers")
    public List<String> getPrioritizers() {
        return prioritizers;
    }

    @JsonProperty("prioritizers")
    public void setPrioritizers(List<String> prioritizers) {
        this.prioritizers = prioritizers;
    }

    @JsonProperty("bends")
    public List<Bend> getBends() {
        return bends;
    }

    @JsonProperty("bends")
    public void setBends(List<Bend> bends) {
        this.bends = bends;
    }

}
