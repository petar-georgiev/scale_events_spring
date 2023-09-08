package com.scale_events.model;

import java.util.Set;

public interface SeminarEvent extends Event {
    String getRecordingUrl();

    Set<LocationDO> getLocations();

    Set<TopicDO> getTopics();

    void setRecordingUrl(String recordingUrl);

    void setLocations(Set<LocationDO> locations);

    void setTopics(Set<TopicDO> topics);
}
