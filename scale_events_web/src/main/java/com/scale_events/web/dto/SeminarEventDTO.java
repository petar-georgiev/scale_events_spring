package com.scale_events.web.dto;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class SeminarEventDTO extends EventDTO {
    private String recordingUrl;
    private Set<TopicDTO> topics;
    private Set<LocationDTO> locations;

    public SeminarEventDTO(UUID id, String name, String imageUrl,
                           LocalDateTime startDate, LocalDateTime endDate, String description,
                           String recordingUrl, Set<LocationDTO> locations, Set<TopicDTO> topics) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.recordingUrl = recordingUrl;
        this.locations = locations;
        this.topics = topics;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public SeminarEventDTO setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }

    public Set<LocationDTO> getLocations() {
        return locations;
    }

    public SeminarEventDTO setLocations(Set<LocationDTO> locations) {
        this.locations = locations;
        return this;
    }

    public Set<TopicDTO> getTopics() {
        return topics;
    }

    public SeminarEventDTO setTopics(Set<TopicDTO> topics) {
        this.topics = topics;
        return this;
    }
}
