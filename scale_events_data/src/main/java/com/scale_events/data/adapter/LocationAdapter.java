package com.scale_events.data.adapter;

import com.scale_events.data.entity.LocationEntity;
import com.scale_events.model.LocationDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationAdapter {

    public LocationEntity convertToEntity(LocationDO location);

    public LocationDO convertFromEntity(LocationEntity locationEntity);
}
