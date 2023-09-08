package com.scale_events.model;

import com.scale_events.model.enums.OfficeLocationEnum;

import java.util.Set;
import java.util.UUID;

public class LocationDO implements Location {
    private UUID id;
    private OfficeLocationEnum name;
    private SeminarEventDO seminarEvent;
    private Set<UserDO> users;
    private Set<InternalTrainingEventDO> internalTrainingEvents;
    private Set<EntertainmentEventDO> entertainmentEvents;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public OfficeLocationEnum getName() {
        return name;
    }

    @Override
    public Set<UserDO> getUsers() {
        return users;
    }

    @Override
    public SeminarEventDO getSeminarEvent() {
        return seminarEvent;
    }

    @Override
    public Set<InternalTrainingEventDO> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    @Override
    public Set<EntertainmentEventDO> getEntertainmentEvents() {
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
    public void setUsers(Set<UserDO> users) {
        this.users = users;
    }

    @Override
    public void setSeminarEvent(SeminarEventDO seminarEvent) {
        this.seminarEvent = seminarEvent;
    }

    @Override
    public void setInternalTrainingEvents(Set<InternalTrainingEventDO> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
    }

    @Override
    public void setEntertainmentEvents(Set<EntertainmentEventDO> entertainmentEvents) {
        this.entertainmentEvents = entertainmentEvents;
    }
}
