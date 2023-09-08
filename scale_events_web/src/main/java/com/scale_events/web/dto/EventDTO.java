package com.scale_events.web.dto;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class EventDTO {
    private  UUID id;
    private  String name;
    private  String imageUrl;
    private  LocalDateTime startDate;
    private  LocalDateTime endDate;
    private  String description;

    public EventDTO(UUID id, String name, String imageUrl, LocalDateTime startDate, LocalDateTime endDate, String description) {
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

    public EventDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EventDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public EventDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public EventDTO setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public EventDTO setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EventDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (EventDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.imageUrl, that.imageUrl) &&
                Objects.equals(this.startDate, that.startDate) &&
                Objects.equals(this.endDate, that.endDate) &&
                Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imageUrl, startDate, endDate, description);
    }

    @Override
    public String toString() {
        return "EventDTO[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "imageUrl=" + imageUrl + ", " +
                "startDate=" + startDate + ", " +
                "endDate=" + endDate + ", " +
                "description=" + description + ']';
    }
}
