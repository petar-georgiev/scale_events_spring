package com.scale_events.data.entity;

import com.scale_events.model.enums.OfficeLocationEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "locations")
public class LocationEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Enumerated(EnumType.STRING)
    private OfficeLocationEnum name;

    @OneToMany(mappedBy = "location")
    private Set<UserEntity> users;

    @ManyToOne
    private SeminarEventEntity seminarEvent;

    @OneToMany(mappedBy = "location")
    private Set<InternalTrainingEventEntity> internalTrainingEvents;

    @OneToMany(mappedBy = "location")
    private Set<EntertainmentEventEntity> entertainmentEvents;


    public LocationEntity() {
    }

    public LocationEntity(UUID id, OfficeLocationEnum name,
                          Set<UserEntity> users, SeminarEventEntity seminarEvent,
                          Set<InternalTrainingEventEntity> internalTrainingEvents,
                          Set<EntertainmentEventEntity> entertainmentEvents) {
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

    public LocationEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public OfficeLocationEnum getName() {
        return name;
    }

    public LocationEntity setName(OfficeLocationEnum name) {
        this.name = name;
        return this;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public LocationEntity setUsers(Set<UserEntity> users) {
        this.users = users;
        return this;
    }

    public SeminarEventEntity getSeminarEvent() {
        return seminarEvent;
    }

    public LocationEntity setSeminarEvent(SeminarEventEntity seminarEvent) {
        this.seminarEvent = seminarEvent;
        return this;
    }

    public Set<InternalTrainingEventEntity> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    public LocationEntity setInternalTrainingEvents(Set<InternalTrainingEventEntity> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
        return this;
    }

    public Set<EntertainmentEventEntity> getEntertainmentEvents() {
        return entertainmentEvents;
    }

    public LocationEntity setEntertainmentEvents(Set<EntertainmentEventEntity> entertainmentEvents) {
        this.entertainmentEvents = entertainmentEvents;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationEntity location = (LocationEntity) o;
        return getId().equals(location.getId()) &&
                getName() == location.getName() && Objects.equals(getUsers(),
                location.getUsers()) && Objects.equals(getSeminarEvent(),
                location.getSeminarEvent()) && Objects.equals(getInternalTrainingEvents(),
                location.getInternalTrainingEvents()) && Objects.equals(getEntertainmentEvents(),
                location.getEntertainmentEvents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getUsers(), getSeminarEvent(), getInternalTrainingEvents(), getEntertainmentEvents());
    }

}
