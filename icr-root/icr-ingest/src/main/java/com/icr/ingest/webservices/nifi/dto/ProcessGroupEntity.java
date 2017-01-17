
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "revision",
    "id",
    "uri",
    "position",
    "permissions",
    "bulletins",
    "component",
    "status",
    "runningCount",
    "stoppedCount",
    "invalidCount",
    "disabledCount",
    "activeRemotePortCount",
    "inactiveRemotePortCount",
    "inputPortCount",
    "outputPortCount"
})
public class ProcessGroupEntity {

    @JsonProperty("revision")
    private Revision revision;
    @JsonProperty("id")
    private String id;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("permissions")
    private Permissions permissions;
    @JsonProperty("bulletins")
    private List<Bulletin> bulletins = new ArrayList<Bulletin>();
    @JsonProperty("component")
    private Component component;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("runningCount")
    private Integer runningCount;
    @JsonProperty("stoppedCount")
    private Integer stoppedCount;
    @JsonProperty("invalidCount")
    private Integer invalidCount;
    @JsonProperty("disabledCount")
    private Integer disabledCount;
    @JsonProperty("activeRemotePortCount")
    private Integer activeRemotePortCount;
    @JsonProperty("inactiveRemotePortCount")
    private Integer inactiveRemotePortCount;
    @JsonProperty("inputPortCount")
    private Integer inputPortCount;
    @JsonProperty("outputPortCount")
    private Integer outputPortCount;

    @JsonProperty("revision")
    public Revision getRevision() {
        return revision;
    }

    @JsonProperty("revision")
    public void setRevision(Revision revision) {
        this.revision = revision;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("position")
    public Position getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Position position) {
        this.position = position;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("bulletins")
    public List<Bulletin> getBulletins() {
        return bulletins;
    }

    @JsonProperty("bulletins")
    public void setBulletins(List<Bulletin> bulletins) {
        this.bulletins = bulletins;
    }

    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("runningCount")
    public Integer getRunningCount() {
        return runningCount;
    }

    @JsonProperty("runningCount")
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    @JsonProperty("stoppedCount")
    public Integer getStoppedCount() {
        return stoppedCount;
    }

    @JsonProperty("stoppedCount")
    public void setStoppedCount(Integer stoppedCount) {
        this.stoppedCount = stoppedCount;
    }

    @JsonProperty("invalidCount")
    public Integer getInvalidCount() {
        return invalidCount;
    }

    @JsonProperty("invalidCount")
    public void setInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
    }

    @JsonProperty("disabledCount")
    public Integer getDisabledCount() {
        return disabledCount;
    }

    @JsonProperty("disabledCount")
    public void setDisabledCount(Integer disabledCount) {
        this.disabledCount = disabledCount;
    }

    @JsonProperty("activeRemotePortCount")
    public Integer getActiveRemotePortCount() {
        return activeRemotePortCount;
    }

    @JsonProperty("activeRemotePortCount")
    public void setActiveRemotePortCount(Integer activeRemotePortCount) {
        this.activeRemotePortCount = activeRemotePortCount;
    }

    @JsonProperty("inactiveRemotePortCount")
    public Integer getInactiveRemotePortCount() {
        return inactiveRemotePortCount;
    }

    @JsonProperty("inactiveRemotePortCount")
    public void setInactiveRemotePortCount(Integer inactiveRemotePortCount) {
        this.inactiveRemotePortCount = inactiveRemotePortCount;
    }

    @JsonProperty("inputPortCount")
    public Integer getInputPortCount() {
        return inputPortCount;
    }

    @JsonProperty("inputPortCount")
    public void setInputPortCount(Integer inputPortCount) {
        this.inputPortCount = inputPortCount;
    }

    @JsonProperty("outputPortCount")
    public Integer getOutputPortCount() {
        return outputPortCount;
    }

    @JsonProperty("outputPortCount")
    public void setOutputPortCount(Integer outputPortCount) {
        this.outputPortCount = outputPortCount;
    }

}
