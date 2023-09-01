package com.scale_events.web.adapter;

import com.scale_events.model.InternalTrainingEventDO;
import com.scale_events.web.dto.InternalTrainingEventDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InternalTrainingEventDTOAdapter {

    public InternalTrainingEventDTO convertToDTO(InternalTrainingEventDO intTE);

    public InternalTrainingEventDO convertFromDTO(InternalTrainingEventDTO intTED);

}
