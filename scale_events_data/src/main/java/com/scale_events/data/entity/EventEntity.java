package com.scale_events.data.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public class EventEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;
    private String imageUrl;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;

    public EventEntity() {
    }

    public EventEntity(UUID id, String name, String imageUrl, LocalDateTime startDate,
                       LocalDateTime endDate, String description) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public EventEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EventEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public EventEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public EventEntity setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public EventEntity setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EventEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventEntity that = (EventEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getName(),
                that.getName()) && Objects.equals(getImageUrl(),
                that.getImageUrl()) && Objects.equals(getStartDate(),
                that.getStartDate()) && Objects.equals(getEndDate(),
                that.getEndDate()) && Objects.equals(getDescription(),
                that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getImageUrl(), getStartDate(), getEndDate(), getDescription());
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                '}';
    }
}
