package com.scale_events.web.adapter;

import com.scale_events.model.SeminarEventDO;
import com.scale_events.web.dto.SeminarEventDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeminarEventDTOAdapter {
    public SeminarEventDTO convertToDTO(SeminarEventDO semE);

    public SeminarEventDO convertFromDTO(SeminarEventDTO semED);
}
