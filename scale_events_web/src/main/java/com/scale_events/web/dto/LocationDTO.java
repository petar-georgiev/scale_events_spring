package com.scale_events.web.dto;

import com.scale_events.model.enums.OfficeLocationEnum;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public  class LocationDTO {
    private  UUID id;
    private  OfficeLocationEnum name;
    private  Set<UserDTO> users;
    private  SeminarEventDTO seminarEvent;
    private  Set<InternalTrainingEventDTO> internalTrainingEvents;
    private  Set<EntertainmentEventDTO> entertainmentEvents;

    public LocationDTO(UUID id, OfficeLocationEnum name, Set<UserDTO> users,
                       SeminarEventDTO seminarEvent, Set<InternalTrainingEventDTO> internalTrainingEvents,
                       Set<EntertainmentEventDTO> entertainmentEvents) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.seminarEvent = seminarEvent;
        this.internalTrainingEvents = internalTrainingEvents;
        this.entertainmentEvents = entertainmentEvents;
    }

    public UUID getId() {
        return id;
    }

    public LocationDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public OfficeLocationEnum getName() {
        return name;
    }

    public LocationDTO setName(OfficeLocationEnum name) {
        this.name = name;
        return this;
    }

    public Set<UserDTO> getUsers() {
        return users;
    }

    public LocationDTO setUsers(Set<UserDTO> users) {
        this.users = users;
        return this;
    }

    public SeminarEventDTO getSeminarEvent() {
        return seminarEvent;
    }

    public LocationDTO setSeminarEvent(SeminarEventDTO seminarEventDTO) {
        this.seminarEvent = seminarEvent;
        return this;
    }

    public Set<InternalTrainingEventDTO> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    public LocationDTO setInternalTrainingEvents(Set<InternalTrainingEventDTO> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
        return this;
    }

    public Set<EntertainmentEventDTO> getEntertainmentEvents() {
        return entertainmentEvents;
    }

    public LocationDTO setEntertainmentEvents(Set<EntertainmentEventDTO> entertainmentEvents) {
        this.entertainmentEvents = entertainmentEvents;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (LocationDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.users, that.users) &&
                Objects.equals(this.seminarEvent, that.seminarEvent) &&
                Objects.equals(this.internalTrainingEvents, that.internalTrainingEvents) &&
                Objects.equals(this.entertainmentEvents, that.entertainmentEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, users, seminarEvent, internalTrainingEvents, entertainmentEvents);
    }

    @Override
    public String toString() {
        return "LocationDTO[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "users=" + users + ", " +
                "seminarEvent=" + seminarEvent + ", " +
                "internalTrainingEvents=" + internalTrainingEvents + ", " +
                "entertainmentEvents=" + entertainmentEvents + ']';
    }
}
