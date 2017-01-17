
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
    "targetUri",
    "targetSecure",
    "name",
    "comments",
    "communicationsTimeout",
    "yieldDuration",
    "transportProtocol",
    "proxyHost",
    "proxyPort",
    "proxyUser",
    "proxyPassword",
    "authorizationIssues",
    "transmitting",
    "inputPortCount",
    "outputPortCount",
    "activeRemoteInputPortCount",
    "inactiveRemoteInputPortCount",
    "activeRemoteOutputPortCount",
    "inactiveRemoteOutputPortCount",
    "flowRefreshed",
    "contents"
})
public class RemoteProcessGroup {

    @JsonProperty("id")
    private String id;
    @JsonProperty("parentGroupId")
    private String parentGroupId;
    @JsonProperty("position")
    private Position position;
    @JsonProperty("targetUri")
    private String targetUri;
    @JsonProperty("targetSecure")
    private Boolean targetSecure;
    @JsonProperty("name")
    private String name;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("communicationsTimeout")
    private String communicationsTimeout;
    @JsonProperty("yieldDuration")
    private String yieldDuration;
    @JsonProperty("transportProtocol")
    private String transportProtocol;
    @JsonProperty("proxyHost")
    private String proxyHost;
    @JsonProperty("proxyPort")
    private Integer proxyPort;
    @JsonProperty("proxyUser")
    private String proxyUser;
    @JsonProperty("proxyPassword")
    private String proxyPassword;
    @JsonProperty("authorizationIssues")
    private List<String> authorizationIssues = new ArrayList<String>();
    @JsonProperty("transmitting")
    private Boolean transmitting;
    @JsonProperty("inputPortCount")
    private Integer inputPortCount;
    @JsonProperty("outputPortCount")
    private Integer outputPortCount;
    @JsonProperty("activeRemoteInputPortCount")
    private Integer activeRemoteInputPortCount;
    @JsonProperty("inactiveRemoteInputPortCount")
    private Integer inactiveRemoteInputPortCount;
    @JsonProperty("activeRemoteOutputPortCount")
    private Integer activeRemoteOutputPortCount;
    @JsonProperty("inactiveRemoteOutputPortCount")
    private Integer inactiveRemoteOutputPortCount;
    @JsonProperty("flowRefreshed")
    private String flowRefreshed;
    @JsonProperty("contents")
    private Contents contents;

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

    @JsonProperty("targetUri")
    public String getTargetUri() {
        return targetUri;
    }

    @JsonProperty("targetUri")
    public void setTargetUri(String targetUri) {
        this.targetUri = targetUri;
    }

    @JsonProperty("targetSecure")
    public Boolean getTargetSecure() {
        return targetSecure;
    }

    @JsonProperty("targetSecure")
    public void setTargetSecure(Boolean targetSecure) {
        this.targetSecure = targetSecure;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("communicationsTimeout")
    public String getCommunicationsTimeout() {
        return communicationsTimeout;
    }

    @JsonProperty("communicationsTimeout")
    public void setCommunicationsTimeout(String communicationsTimeout) {
        this.communicationsTimeout = communicationsTimeout;
    }

    @JsonProperty("yieldDuration")
    public String getYieldDuration() {
        return yieldDuration;
    }

    @JsonProperty("yieldDuration")
    public void setYieldDuration(String yieldDuration) {
        this.yieldDuration = yieldDuration;
    }

    @JsonProperty("transportProtocol")
    public String getTransportProtocol() {
        return transportProtocol;
    }

    @JsonProperty("transportProtocol")
    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    @JsonProperty("proxyHost")
    public String getProxyHost() {
        return proxyHost;
    }

    @JsonProperty("proxyHost")
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    @JsonProperty("proxyPort")
    public Integer getProxyPort() {
        return proxyPort;
    }

    @JsonProperty("proxyPort")
    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    @JsonProperty("proxyUser")
    public String getProxyUser() {
        return proxyUser;
    }

    @JsonProperty("proxyUser")
    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    @JsonProperty("proxyPassword")
    public String getProxyPassword() {
        return proxyPassword;
    }

    @JsonProperty("proxyPassword")
    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    @JsonProperty("authorizationIssues")
    public List<String> getAuthorizationIssues() {
        return authorizationIssues;
    }

    @JsonProperty("authorizationIssues")
    public void setAuthorizationIssues(List<String> authorizationIssues) {
        this.authorizationIssues = authorizationIssues;
    }

    @JsonProperty("transmitting")
    public Boolean getTransmitting() {
        return transmitting;
    }

    @JsonProperty("transmitting")
    public void setTransmitting(Boolean transmitting) {
        this.transmitting = transmitting;
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

    @JsonProperty("activeRemoteInputPortCount")
    public Integer getActiveRemoteInputPortCount() {
        return activeRemoteInputPortCount;
    }

    @JsonProperty("activeRemoteInputPortCount")
    public void setActiveRemoteInputPortCount(Integer activeRemoteInputPortCount) {
        this.activeRemoteInputPortCount = activeRemoteInputPortCount;
    }

    @JsonProperty("inactiveRemoteInputPortCount")
    public Integer getInactiveRemoteInputPortCount() {
        return inactiveRemoteInputPortCount;
    }

    @JsonProperty("inactiveRemoteInputPortCount")
    public void setInactiveRemoteInputPortCount(Integer inactiveRemoteInputPortCount) {
        this.inactiveRemoteInputPortCount = inactiveRemoteInputPortCount;
    }

    @JsonProperty("activeRemoteOutputPortCount")
    public Integer getActiveRemoteOutputPortCount() {
        return activeRemoteOutputPortCount;
    }

    @JsonProperty("activeRemoteOutputPortCount")
    public void setActiveRemoteOutputPortCount(Integer activeRemoteOutputPortCount) {
        this.activeRemoteOutputPortCount = activeRemoteOutputPortCount;
    }

    @JsonProperty("inactiveRemoteOutputPortCount")
    public Integer getInactiveRemoteOutputPortCount() {
        return inactiveRemoteOutputPortCount;
    }

    @JsonProperty("inactiveRemoteOutputPortCount")
    public void setInactiveRemoteOutputPortCount(Integer inactiveRemoteOutputPortCount) {
        this.inactiveRemoteOutputPortCount = inactiveRemoteOutputPortCount;
    }

    @JsonProperty("flowRefreshed")
    public String getFlowRefreshed() {
        return flowRefreshed;
    }

    @JsonProperty("flowRefreshed")
    public void setFlowRefreshed(String flowRefreshed) {
        this.flowRefreshed = flowRefreshed;
    }

    @JsonProperty("contents")
    public Contents getContents() {
        return contents;
    }

    @JsonProperty("contents")
    public void setContents(Contents contents) {
        this.contents = contents;
    }

}
