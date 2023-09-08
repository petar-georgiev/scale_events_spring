package com.scale_events.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "seminar_events")
public class SeminarEventEntity extends EventEntity {

    private String recordingUrl;
    @OneToMany(mappedBy = "seminarEvent")
    private Set<TopicEntity> topics;
    @OneToMany(mappedBy = "seminarEvent")
    private Set<LocationEntity> locations;

    public SeminarEventEntity() {
    }

    public SeminarEventEntity(UUID id, String name, String imageUrl,
                              LocalDateTime startDate, LocalDateTime endDate,
                              String description, String recordingUrl,
                              Set<LocationEntity> locations, Set<TopicEntity> topics) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.recordingUrl = recordingUrl;
        this.locations = locations;
        this.topics = topics;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public SeminarEventEntity setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }

    public Set<LocationEntity> getLocations() {
        return locations;
    }

    public SeminarEventEntity setLocations(Set<LocationEntity> locations) {
        this.locations = locations;
        return this;
    }

    public Set<TopicEntity> getTopics() {
        return topics;
    }

    public SeminarEventEntity setTopics(Set<TopicEntity> topics) {
        this.topics = topics;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SeminarEventEntity that = (SeminarEventEntity) o;
        return Objects.equals(getRecordingUrl(),
                that.getRecordingUrl()) && Objects.equals(getTopics(),
                that.getTopics()) && Objects.equals(getLocations(), that.getLocations());
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRecordingUrl(), getTopics(), getLocations());
    }

    @Override
    public String toString() {
        return "SeminarEventEntity{" +
                "recordingUrl='" + recordingUrl + '\'' +
                ", topics=" + topics +
                ", locations=" + locations +
                '}';
    }
}
