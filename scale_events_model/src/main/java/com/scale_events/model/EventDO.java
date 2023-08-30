package com.scale_events.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class EventDO implements Event {

    private UUID id;

    private String name;

    private String imageUrl;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;


    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public LocalDateTime getStartDate() {
        return startDate;
    }

    @Override
    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setImageUrl(String ImageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
