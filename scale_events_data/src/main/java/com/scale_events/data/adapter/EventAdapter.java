package com.scale_events.data.adapter;

import com.scale_events.data.entity.EventEntity;
import com.scale_events.model.EventDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventAdapter {
    EventEntity convertToEntity(EventDO event);

    EventDO convertFromEntity(EventEntity eventEntity);
}
