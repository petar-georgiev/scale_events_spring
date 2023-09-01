package com.scale_events.web.adapter;

import com.scale_events.model.UserDO;
import com.scale_events.web.dto.UserDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserDTOAdapter {

    public UserDTO convertToDTO(UserDO user);

    public UserDO convertFromDTO(UserDTO userDTO);

}
