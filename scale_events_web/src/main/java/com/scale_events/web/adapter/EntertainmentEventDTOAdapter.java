package com.scale_events.web.adapter;

import com.scale_events.model.EntertainmentEventDO;
import com.scale_events.web.dto.EntertainmentEventDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntertainmentEventDTOAdapter {
    EntertainmentEventDTO convertToDTO(EntertainmentEventDO entertainmentEvent);

    EntertainmentEventDO convertFromDTO(EntertainmentEventDTO entertainmentEventDTO);
}
