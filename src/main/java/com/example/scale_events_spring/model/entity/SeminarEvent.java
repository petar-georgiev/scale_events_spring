package com.example.scale_events_spring.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "seminar_events")
public class SeminarEvent extends Event{

    private String recordingUrl;

    @OneToMany(mappedBy = "seminarEvent")
    private Set<Location> location;

    @OneToMany(mappedBy = "seminarEvent")
    private Set<Topic> topic;

    public SeminarEvent() {

    }

    public SeminarEvent(String id, String name, String imageUrl, LocalDateTime startDate, LocalDateTime endDate, String description, String recordingUrl, Set<Location> location, Set<Topic> topic) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.recordingUrl = recordingUrl;
        this.location = location;
        this.topic = topic;
    }

    public String getRecordingUrl() {
        return recordingUrl;
    }

    public SeminarEvent setRecordingUrl(String recordingUrl) {
        this.recordingUrl = recordingUrl;
        return this;
    }

    public Set<Location> getLocation() {
        return location;
    }

    public SeminarEvent setLocation(Set<Location> location) {
        this.location = location;
        return this;
    }

    public Set<Topic> getTopic() {
        return topic;
    }

    public SeminarEvent setTopic(Set<Topic> topic) {
        this.topic = topic;
        return this;
    }
}
