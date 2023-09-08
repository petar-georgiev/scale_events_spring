package com.scale_events.model;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Event {
    UUID getId();

    String getName();

    String getImageUrl();

    LocalDateTime getStartDate();

    LocalDateTime getEndDate();

    String getDescription();

    void setId(UUID id);

    void setName(String name);

    void setImageUrl(String ImageUrl);

    void setStartDate(LocalDateTime startDate);

    void setEndDate(LocalDateTime endDate);

    void setDescription(String description);
}
