package com.example.scale_events_spring.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;


@Entity
@Table(name = "entertainment_events")
public class EntertainmentEvent extends Event {


    private String activity;

    @ManyToOne
    private Location location;

    public EntertainmentEvent() {
    }

    public EntertainmentEvent(String id, String name, String imageUrl, LocalDateTime startDate, LocalDateTime endDate, String description, String activity, Location location) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.activity = activity;
        this.location = location;
    }

    public String getActivity() {
        return activity;
    }

    public EntertainmentEvent setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public EntertainmentEvent setLocation(Location location) {
        this.location = location;
        return this;
    }
}
