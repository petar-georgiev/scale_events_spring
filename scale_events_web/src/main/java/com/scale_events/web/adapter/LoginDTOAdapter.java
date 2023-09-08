package com.scale_events.web.adapter;

import com.scale_events.model.LoginDO;
import com.scale_events.web.dto.LoginDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoginDTOAdapter {
    public LoginDTO convertToDTO(LoginDO user);

    public LoginDO convertFromDTO(LoginDTO loginDTO);
}
