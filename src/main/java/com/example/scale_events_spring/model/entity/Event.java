package com.example.scale_events_spring.model.entity;

import com.example.scale_events_spring.model.entity.enums.EventTypeEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Enumerated(EnumType.STRING)
    private EventTypeEnum eventType;

    @ManyToMany(mappedBy = "events")
    private Set<User> attendees;

    public Event(String id, String name, EventTypeEnum eventType, Set<User> attendees) {
        this.id = id;
        this.name = name;
        this.eventType = eventType;
        this.attendees = attendees;
    }

    public Event() {
    }

    public String getId() {
        return id;
    }

    public Event setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Event setName(String name) {
        this.name = name;
        return this;
    }

    public EventTypeEnum getEventType() {
        return eventType;
    }

    public Event setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    public Set<User> getAttendees() {
        return attendees;
    }

    public Event setAttendees(Set<User> attendees) {
        this.attendees = attendees;
        return this;
    }

}
