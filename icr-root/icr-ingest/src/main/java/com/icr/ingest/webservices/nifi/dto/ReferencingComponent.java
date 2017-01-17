
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
    "component"
})
public class ReferencingComponent {

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

}
