package com.scale_events.model;

import java.util.Set;

public interface SeminarEvent extends Event{
    String getRecordingUrl();
    Set<Location> getLocations();
    Set<Topic> getTopics();

     void setRecordingUrl(String recordingUrl);
    void setLocations(Set<Location> locations);
    void setTopics(Set<Topic> topics);

}
