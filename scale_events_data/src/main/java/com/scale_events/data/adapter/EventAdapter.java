package com.scale_events.data.adapter;

import com.scale_events.data.entity.EventEntity;
import com.scale_events.model.Event;
import com.scale_events.model.EventDO;

public class EventAdapter implements EntityAdapter<EventEntity, Event> {

    @Override
    public EventEntity convertToEntity(Event event) {
        if (event == null) {
            return null;
        }
        EventEntity eventEntity = new EventEntity();
        eventEntity.setId(event.getId());
        eventEntity.setName(event.getName());
        eventEntity.setImageUrl(event.getImageUrl());
        eventEntity.setStartDate(event.getStartDate());
        eventEntity.setEndDate(event.getEndDate());
        eventEntity.setDescription(event.getDescription());

        return eventEntity;
    }

    @Override
    public Event convertFromEntity(EventEntity eventEntity) {
        if (eventEntity == null) {
            return null;
        }
        Event event = new EventDO();
        event.setId(eventEntity.getId());
        event.setName(eventEntity.getName());
        event.setImageUrl(eventEntity.getImageUrl());
        event.setStartDate(eventEntity.getStartDate());
        event.setEndDate(eventEntity.getEndDate());
        event.setDescription(eventEntity.getDescription());

        return event;
    }
}
