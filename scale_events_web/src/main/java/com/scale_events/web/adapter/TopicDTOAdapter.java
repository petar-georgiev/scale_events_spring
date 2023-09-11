package com.scale_events.web.adapter;

import com.scale_events.model.TopicDO;
import com.scale_events.web.dto.TopicDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TopicDTOAdapter  {
    TopicDTO convertToDTO(TopicDO topic);

    TopicDO convertFromDTO(TopicDTO topicDTO);
}
