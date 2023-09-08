package com.scale_events.data.adapter;

import com.scale_events.data.entity.EntertainmentEventEntity;
import com.scale_events.model.EntertainmentEventDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntertainmentEventAdapter {
    public EntertainmentEventEntity convertToEntity(EntertainmentEventDO entertainmentEvent);

    public EntertainmentEventDO convertFromEntity(EntertainmentEventEntity entertainmentEventEntity);
}
