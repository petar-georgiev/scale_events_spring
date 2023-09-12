package com.scale_events.data.adapter;

import com.scale_events.data.entity.SeminarEventEntity;
import com.scale_events.model.SeminarEventDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeminarEventAdapter {
    SeminarEventEntity convertToEntity(SeminarEventDO seminarEvent);

    SeminarEventDO convertFromEntity(SeminarEventEntity internalTrainingEventEntity);
}
