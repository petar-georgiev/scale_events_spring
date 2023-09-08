package com.scale_events.data.adapter;

import com.scale_events.data.entity.SeminarEventEntity;
import com.scale_events.model.SeminarEventDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeminarEventAdapter {
    public SeminarEventEntity convertToEntity(SeminarEventDO seminarEvent);

    public SeminarEventDO convertFromEntity(SeminarEventEntity internalTrainingEventEntity);
}
