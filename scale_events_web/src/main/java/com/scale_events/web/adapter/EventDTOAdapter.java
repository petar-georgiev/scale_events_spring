package com.scale_events.web.adapter;

import com.scale_events.model.Event;
import com.scale_events.model.EventDO;
import com.scale_events.web.dto.EventDTO;
import org.springframework.stereotype.Component;

@Component
public class EventDTOAdapter implements DTOAdapter<EventDTO, Event>{
    @Override
    public EventDTO convertToDTO(Event event) {
        if (event == null) {
            return null;
        }
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setName(event.getName());
        eventDTO.setImageUrl(event.getImageUrl());
        eventDTO.setStartDate(event.getStartDate());
        eventDTO.setEndDate(event.getEndDate());
        eventDTO.setDescription(event.getDescription());

        return eventDTO;
    }

    @Override
    public Event convertFromDTO(EventDTO eventDTO) {
        if (eventDTO == null) {
            return null;
        }
        Event event = new EventDO();
        event.setId(eventDTO.getId());
        event.setName(eventDTO.getName());
        event.setImageUrl(eventDTO.getImageUrl());
        event.setStartDate(eventDTO.getStartDate());
        event.setEndDate(eventDTO.getEndDate());
        event.setDescription(eventDTO.getDescription());

        return event;
    }
}
