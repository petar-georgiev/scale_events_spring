package com.scale_events.web.adapter;

import com.scale_events.model.LocationDO;
import com.scale_events.web.dto.LocationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationDTOAdapter  {
    public LocationDTO convertToDTO(LocationDO location);

    public LocationDO convertFromDTO(LocationDTO locationDTO) ;
}
