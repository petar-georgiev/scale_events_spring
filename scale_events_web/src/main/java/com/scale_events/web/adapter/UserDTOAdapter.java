package com.scale_events.web.adapter;

import com.scale_events.model.UserDO;
import com.scale_events.service.response.UserResponse;
import com.scale_events.web.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDTOAdapter {
    UserDTO convertToDTO(UserDO user);

    UserDO convertFromDTO(UserDTO userDTO);

    UserResponse convertToResponse(UserDO user);
}
