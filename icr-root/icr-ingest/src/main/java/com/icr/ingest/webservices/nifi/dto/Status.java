
package com.icr.ingest.webservices.nifi.dto;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "statsLastRefreshed",
    "aggregateSnapshot",
    "nodeSnapshots"
})
public class Status {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("statsLastRefreshed")
    private String statsLastRefreshed;
    @JsonProperty("aggregateSnapshot")
    private AggregateSnapshot aggregateSnapshot;
    @JsonProperty("nodeSnapshots")
    private List<NodeSnapshot> nodeSnapshots = new ArrayList<NodeSnapshot>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("statsLastRefreshed")
    public String getStatsLastRefreshed() {
        return statsLastRefreshed;
    }

    @JsonProperty("statsLastRefreshed")
    public void setStatsLastRefreshed(String statsLastRefreshed) {
        this.statsLastRefreshed = statsLastRefreshed;
    }

    @JsonProperty("aggregateSnapshot")
    public AggregateSnapshot getAggregateSnapshot() {
        return aggregateSnapshot;
    }

    @JsonProperty("aggregateSnapshot")
    public void setAggregateSnapshot(AggregateSnapshot aggregateSnapshot) {
        this.aggregateSnapshot = aggregateSnapshot;
    }

    @JsonProperty("nodeSnapshots")
    public List<NodeSnapshot> getNodeSnapshots() {
        return nodeSnapshots;
    }

    @JsonProperty("nodeSnapshots")
    public void setNodeSnapshots(List<NodeSnapshot> nodeSnapshots) {
        this.nodeSnapshots = nodeSnapshots;
    }

}
