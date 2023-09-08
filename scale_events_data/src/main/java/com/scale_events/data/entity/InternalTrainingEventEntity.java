package com.scale_events.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "internal_training_events")
public class InternalTrainingEventEntity extends EventEntity {

    private String recordingUrl;

    @ManyToOne
    private TopicEntity topic;

    @ManyToOne
    private LocationEntity location;

    public InternalTrainingEventEntity(UUID id, String name, String imageUrl,
                                       LocalDateTime startDate, LocalDateTime endDate,
                                       String description, String recordingUrl,
                                       TopicEntity topic, LocationEntity location) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.recordingUrl = recordingUrl;
        this.topic = topic;
        this.location = location;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public InternalTrainingEventEntity setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }

    public TopicEntity getTopic() {
        return topic;
    }

    public InternalTrainingEventEntity setTopic(TopicEntity topic) {
        this.topic = topic;
        return this;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public InternalTrainingEventEntity setLocation(LocationEntity location) {
        this.location = location;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InternalTrainingEventEntity that = (InternalTrainingEventEntity) o;
        return Objects.equals(getRecordingUrl(), that.getRecordingUrl())
                && Objects.equals(getTopic(), that.getTopic()) && Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRecordingUrl(), getTopic(), getLocation());
    }
}
