package com.scale_events.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "entertainment_events")
public class EntertainmentEventEntity extends EventEntity {

    private String activity;
    @ManyToOne
    private LocationEntity location;

    public EntertainmentEventEntity() {
    }

    public EntertainmentEventEntity(UUID id, String name, String imageUrl,
                                    LocalDateTime startDate, LocalDateTime endDate,
                                    String description, String activity, LocationEntity location) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.activity = activity;
        this.location = location;
    }

    public String getActivity() {
        return activity;
    }

    public EntertainmentEventEntity setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public LocationEntity getLocation() {
        return location;
    }

    public EntertainmentEventEntity setLocation(LocationEntity location) {
        this.location = location;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntertainmentEventEntity that = (EntertainmentEventEntity) o;
        return Objects.equals(getActivity(), that.getActivity()) && Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActivity(), getLocation());
    }

    @Override
    public String toString() {
        return "EntertainmentEventEntity{" +
                "activity='" + activity + '\'' +
                ", location=" + location +
                '}';
    }
}
