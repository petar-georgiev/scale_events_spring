package com.scale_events.data.adapter;

import com.scale_events.data.entity.InternalTrainingEventEntity;
import com.scale_events.model.InternalTrainingEventDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InternalTrainingEventAdapter {
    InternalTrainingEventEntity convertToEntity(InternalTrainingEventDO internalTrainingEvent);

    InternalTrainingEventDO convertFromEntity(InternalTrainingEventEntity internalTrainingEventEntity);
}
