package com.scale_events.web.adapter;

import com.scale_events.model.EventDO;
import com.scale_events.web.dto.EventDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventDTOAdapter {
    EventDTO convertToDTO(EventDO event);

    EventDO convertFromDTO(EventDTO eventDTO);
}
