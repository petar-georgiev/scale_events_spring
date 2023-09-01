package com.scale_events.model;

public interface InternalTrainingEvent extends Event {
    String getRecordingUrl();

    TopicDO getTopic();

    LocationDO getLocation();

    void setRecordingUrl(String recordingUrl);

    void setTopic(TopicDO topic);

    void setLocation(LocationDO location);
}
