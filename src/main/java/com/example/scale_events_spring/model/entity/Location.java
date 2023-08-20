package com.example.scale_events_spring.model.entity;

import com.example.scale_events_spring.model.entity.enums.OfficeLocationEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(EnumType.STRING)
    private OfficeLocationEnum name;

    @OneToMany(mappedBy = "location")
    private Set<User> users;

    @ManyToOne
    private SeminarEvent seminarEvent;

    @OneToMany(mappedBy = "location")
    private Set<InternalTrainingEvent> internalTrainingEvents;

    @OneToMany(mappedBy = "location")
    private Set<EntertainmentEvent> entertainmentEvents;


    public Location() {
    }

    public Location(String id, OfficeLocationEnum name, Set<User> users, SeminarEvent seminarEvent, Set<InternalTrainingEvent> internalTrainingEvents, Set<EntertainmentEvent> entertainmentEvents) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.seminarEvent = seminarEvent;
        this.internalTrainingEvents = internalTrainingEvents;
        this.entertainmentEvents = entertainmentEvents;
    }
}
