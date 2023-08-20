package com.example.scale_events_spring.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "internal_training_events")
public class InternalTrainingEvent extends Event{

    private String recordingUrl;

    @ManyToOne
    private Topic topic;

    @ManyToOne
    private Location location;

    public InternalTrainingEvent() {
    }

    public InternalTrainingEvent(String id, String name, String imageUrl, LocalDateTime startDate, LocalDateTime endDate, String description, String recordingUrl, Topic topic, Location location) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.recordingUrl = recordingUrl;
        this.topic = topic;
        this.location = location;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public InternalTrainingEvent setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }

    public Topic getTopic() {
        return topic;
    }

    public InternalTrainingEvent setTopic(Topic topic) {
        this.topic = topic;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public InternalTrainingEvent setLocation(Location location) {
        this.location = location;
        return this;
    }

}
