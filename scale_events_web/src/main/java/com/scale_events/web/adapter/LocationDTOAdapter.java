package com.scale_events.web.adapter;

import com.scale_events.model.LocationDO;
import com.scale_events.web.dto.LocationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationDTOAdapter  {
    LocationDTO convertToDTO(LocationDO location);

    LocationDO convertFromDTO(LocationDTO locationDTO) ;
}
