package com.scale_events.web.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class EntertainmentEventDTO extends EventDTO {
    private String activity;
    private LocationDTO location;

    public EntertainmentEventDTO(UUID id, String name, String imageUrl,
                                 LocalDateTime startDate, LocalDateTime endDate,
                                 String description, String activity, LocationDTO location) {
        super(id, name, imageUrl, startDate, endDate, description);
        this.activity = activity;
        this.location = location;
    }

    public String getActivity() {
        return activity;
    }

    public EntertainmentEventDTO setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public LocationDTO getLocation() {
        return location;
    }

    public EntertainmentEventDTO setLocation(LocationDTO location) {
        this.location = location;
        return this;
    }
}
