package com.scale_events.web.adapter;

import com.scale_events.model.SeminarEventDO;
import com.scale_events.web.dto.SeminarEventDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeminarEventDTOAdapter {
    SeminarEventDTO convertToDTO(SeminarEventDO semE);

    SeminarEventDO convertFromDTO(SeminarEventDTO semED);
}
