package com.scale_events.web.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public  class InternalTrainingEventDTO extends EventDTO {
    private  String recordingUrl;
    private  TopicDTO topic;
    private  LocationDTO location;

    public InternalTrainingEventDTO(UUID id, String name, String imageUrl,
                                    LocalDateTime startDate, LocalDateTime endDate,
                                    String description, String recordingUrl, TopicDTO topic, LocationDTO location) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.recordingUrl = recordingUrl;
        this.topic = topic;
        this.location = location;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public InternalTrainingEventDTO setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }

    public TopicDTO getTopic() {
        return topic;
    }

    public InternalTrainingEventDTO setTopic(TopicDTO topic) {
        this.topic = topic;
        return this;
    }
    public LocationDTO getLocation() {
        return location;
    }

    public InternalTrainingEventDTO setLocation(LocationDTO location) {
        this.location = location;
        return this;
    }
}
