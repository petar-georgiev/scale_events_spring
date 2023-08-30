package com.scale_events.model;

public interface InternalTrainingEvent extends Event{
    String getRecordingUrl();

    Topic getTopic();

    Location getLocation();

    void setRecordingUrl(String recordingUrl);

    void setTopic(Topic topic);

    void setLocation(Location location);
}
