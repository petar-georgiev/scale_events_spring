package com.scale_events.model;

public class InternalTrainingEventDO extends EventDO implements InternalTrainingEvent {
    private String recordingUrl;

    private Topic topic;

    private Location location;

    @Override
    public String getRecordingUrl() {
        return recordingUrl;
    }

    @Override
    public Topic getTopic() {
        return topic;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    @Override
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

}
