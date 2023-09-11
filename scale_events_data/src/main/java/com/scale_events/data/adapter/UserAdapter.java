package com.scale_events.data.adapter;

import com.scale_events.data.entity.UserEntity;
import com.scale_events.model.UserDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAdapter {
    UserEntity convertToEntity(UserDO user);

    UserDO convertFromEntity(UserEntity userEntity);
}
