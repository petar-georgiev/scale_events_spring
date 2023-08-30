package com.scale_events.model;

import com.scale_events.model.enums.OfficeLocationEnum;

import java.util.Set;
import java.util.UUID;


public class LocationDO implements Location {
    private UUID id;

    private OfficeLocationEnum name;

    private SeminarEvent seminarEvent;

    private Set<User> users;

    private Set<InternalTrainingEvent> internalTrainingEvents;

    private Set<EntertainmentEvent> entertainmentEvents;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public OfficeLocationEnum getName() {
        return name;
    }

    @Override
    public Set<User> getUsers() {
        return users;
    }

    @Override
    public SeminarEvent getSeminarEvent() {
        return seminarEvent;
    }

    @Override
    public Set<InternalTrainingEvent> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    @Override
    public Set<EntertainmentEvent> getEntertainmentEvents() {
        return entertainmentEvents;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void setName(OfficeLocationEnum name) {
        this.name = name;
    }

    @Override
    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public void setSeminarEvent(SeminarEvent seminarEvent) {
        this.seminarEvent = seminarEvent;
    }

    @Override
    public void setInternalTrainingEvents(Set<InternalTrainingEvent> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
    }

    @Override
    public void setEntertainmentEvents(Set<EntertainmentEvent> entertainmentEvents) {
        this.entertainmentEvents = entertainmentEvents;
    }
}
