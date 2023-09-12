package com.scale_events.data.adapter;

import com.scale_events.data.entity.TopicEntity;
import com.scale_events.model.TopicDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TopicAdapter {
    TopicEntity convertToEntity(TopicDO topic);

    TopicDO convertFromEntity(TopicEntity topicEntity);
}
