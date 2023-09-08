package com.scale_events.model;

import java.util.Set;

public class SeminarEventDO extends EventDO implements SeminarEvent {
    private String recordingUrl;

    private Set<LocationDO> locations;

    private Set<TopicDO> topics;

    @Override
    public String getRecordingUrl() {
        return recordingUrl;
    }

    @Override
    public Set<LocationDO> getLocations() {
        return locations;
    }

    @Override
    public Set<TopicDO> getTopics() {
        return topics;
    }

    @Override
    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    @Override
    public void setLocations(Set<LocationDO> locations) {
        this.locations = locations;
    }

    @Override
    public void setTopics(Set<TopicDO> topics) {
        this.topics = topics;
    }
}
