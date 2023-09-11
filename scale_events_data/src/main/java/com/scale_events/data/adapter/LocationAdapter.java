package com.scale_events.data.adapter;

import com.scale_events.data.entity.LocationEntity;
import com.scale_events.model.LocationDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationAdapter {
    LocationEntity convertToEntity(LocationDO location);

    LocationDO convertFromEntity(LocationEntity locationEntity);
}
