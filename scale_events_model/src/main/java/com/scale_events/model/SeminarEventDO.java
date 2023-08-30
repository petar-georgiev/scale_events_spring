package com.scale_events.model;

import java.util.Set;

public class SeminarEventDO extends EventDO implements SeminarEvent {
    private String recordingUrl;

    private Set<Location> locations;

    private Set<Topic> topics;

    @Override
    public String getRecordingUrl() {
        return recordingUrl;
    }

    @Override
    public Set<Location> getLocations() {
        return locations;
    }

    @Override
    public Set<Topic> getTopics() {
        return topics;
    }
    @Override
    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    @Override
    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    @Override
    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }
}
