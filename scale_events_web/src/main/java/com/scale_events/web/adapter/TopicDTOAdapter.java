package com.scale_events.web.adapter;


import com.scale_events.model.Topic;
import com.scale_events.model.TopicDO;
import com.scale_events.web.dto.TopicDTO;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;
@Component
public class TopicDTOAdapter implements DTOAdapter<TopicDTO, Topic> {
    private final SeminarEventDTOAdapter seminarEventDTOAdapter;
    private final InternalTrainingEventDTOAdapter internalTrainingEventDTOAdapter;
    private final SkillAreaDTOAdapter skillAreaDTOAdapter;
    private final CategoryDTOAdapter categoryDTOAdapter;

    public TopicDTOAdapter(SeminarEventDTOAdapter seminarEventDTOAdapter, InternalTrainingEventDTOAdapter internalTrainingEventDTOAdapter, SkillAreaDTOAdapter skillAreaDTOAdapter, CategoryDTOAdapter categoryDTOAdapter) {
        this.seminarEventDTOAdapter = seminarEventDTOAdapter;
        this.internalTrainingEventDTOAdapter = internalTrainingEventDTOAdapter;
        this.skillAreaDTOAdapter = skillAreaDTOAdapter;
        this.categoryDTOAdapter = categoryDTOAdapter;
    }

    @Override
    public TopicDTO convertToDTO(Topic topic) {
        if (topic == null) {
            return null;
        }
        TopicDTO topicDTO = new TopicDTO();
        topicDTO.setId(topic.getId());
        topicDTO.setName(topic.getName());
        topicDTO.setDescription(topic.getDescription());
        topicDTO.setSkillArea(skillAreaDTOAdapter.convertToDTO(topic.getSkillArea()));
        topicDTO.setSeminarEvent(seminarEventDTOAdapter.convertToDTO(topic.getSeminarEvent()));
        topicDTO.setInternalTrainingEvents(internalTrainingEventDTOAdapter
                .convertToDTOSet(topic.getInternalTrainingEvents()));
        topicDTO.setCategory(categoryDTOAdapter.convertToDTO(topic.getCategory()));

        return topicDTO;
    }

    @Override
    public Topic convertFromDTO(TopicDTO topicDTO) {
        if (topicDTO == null) {
            return null;
        }
        Topic topic = new TopicDO();
        topic.setId(topicDTO.getId());
        topic.setName(topicDTO.getName());
        topic.setDescription(topicDTO.getDescription());
        topic.setSkillArea(skillAreaDTOAdapter.convertFromDTO(topicDTO.getSkillArea()));
        topic.setSeminarEvent(seminarEventDTOAdapter.convertFromDTO(topicDTO.getSeminarEvent()));
        topic.setInternalTrainingEvents(internalTrainingEventDTOAdapter
                .convertFromDTOSet(topicDTO.getInternalTrainingEvents()));
        topic.setCategory(categoryDTOAdapter.convertFromDTO(topicDTO.getCategory()));

        return topic;
    }

    protected Set<TopicDTO> convertToDTOSet(Set<Topic> topics) {
        if (topics == null) {
            return null;
        }
        Set<TopicDTO> topicDTOSet = new LinkedHashSet<>();
        for (Topic topic : topics) {
            topicDTOSet.add(convertToDTO(topic));
        }
        return topicDTOSet;
    }

    protected Set<Topic> convertFromDTOSet(Set<TopicDTO> topicDTOSet) {
        if (topicDTOSet == null) {
            return null;
        }
        Set<Topic> topics = new LinkedHashSet<>();
        for (TopicDTO topicDTO : topicDTOSet) {
            topics.add(convertFromDTO(topicDTO));
        }
        return topics;
    }
}
