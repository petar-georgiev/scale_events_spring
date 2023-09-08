package com.scale_events.model;

public class InternalTrainingEventDO extends EventDO implements InternalTrainingEvent {
    private String recordingUrl;

    private TopicDO topic;

    private LocationDO location;

    @Override
    public String getRecordingUrl() {
        return recordingUrl;
    }

    @Override
    public TopicDO getTopic() {
        return topic;
    }

    @Override
    public LocationDO getLocation() {
        return location;
    }

    @Override
    public void setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
    }

    @Override
    public void setTopic(TopicDO topic) {
        this.topic = topic;
    }

    @Override
    public void setLocation(LocationDO location) {
        this.location = location;
    }
}
