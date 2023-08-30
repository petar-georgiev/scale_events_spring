package com.scale_events.data.adapter;

import com.scale_events.data.entity.TopicEntity;
import com.scale_events.model.Topic;
import com.scale_events.model.TopicDO;

import java.util.LinkedHashSet;
import java.util.Set;

public class TopicAdapter implements EntityAdapter<TopicEntity, Topic> {
    private final SeminarEventAdapter seminarEventAdapter;
    private final InternalTrainingEventAdapter internalTrainingEventAdapter;
    private final SkillAreaAdapter skillAreaAdapter;
    private final CategoryAdapter categoryAdapter;

    public TopicAdapter(SeminarEventAdapter seminarEventAdapter, InternalTrainingEventAdapter internalTrainingEventAdapter, SkillAreaAdapter skillAreaAdapter, CategoryAdapter categoryAdapter) {
        this.seminarEventAdapter = seminarEventAdapter;
        this.internalTrainingEventAdapter = internalTrainingEventAdapter;
        this.skillAreaAdapter = skillAreaAdapter;
        this.categoryAdapter = categoryAdapter;
    }

    @Override
    public TopicEntity convertToEntity(Topic topic) {
        if (topic == null) {
            return null;
        }
        TopicEntity topicEntity = new TopicEntity();
        topicEntity.setId(topic.getId());
        topicEntity.setName(topic.getName());
        topicEntity.setDescription(topic.getDescription());
        topicEntity.setSkillArea(skillAreaAdapter.convertToEntity(topic.getSkillArea()));
        topicEntity.setSeminarEvent(seminarEventAdapter.convertToEntity(topic.getSeminarEvent()));
        topicEntity.setInternalTrainingEvents(internalTrainingEventAdapter
                .convertToEntitySet(topic.getInternalTrainingEvents()));
        topicEntity.setCategory(categoryAdapter.convertToEntity(topic.getCategory()));

        return topicEntity;
    }

    @Override
    public Topic convertFromEntity(TopicEntity topicEntity) {
        if (topicEntity == null) {
            return null;
        }
        Topic topic = new TopicDO();
        topic.setId(topicEntity.getId());
        topic.setName(topicEntity.getName());
        topic.setDescription(topicEntity.getDescription());
        topic.setSkillArea(skillAreaAdapter.convertFromEntity(topicEntity.getSkillArea()));
        topic.setSeminarEvent(seminarEventAdapter.convertFromEntity(topicEntity.getSeminarEvent()));
        topic.setInternalTrainingEvents(internalTrainingEventAdapter
                .convertFromEntitySet(topicEntity.getInternalTrainingEvents()));
        topic.setCategory(categoryAdapter.convertFromEntity(topicEntity.getCategory()));

        return topic;
    }

    protected Set<TopicEntity> convertToEntitySet(Set<Topic> topics) {
        if (topics == null) {
            return null;
        }
        Set<TopicEntity> topicEntities = new LinkedHashSet<>();
        for (Topic topic : topics) {
            topicEntities.add(convertToEntity(topic));
        }
        return topicEntities;
    }

    protected Set<Topic> convertFromEntitySet(Set<TopicEntity> topicEntities) {
        if (topicEntities == null) {
            return null;
        }
        Set<Topic> topics = new LinkedHashSet<>();
        for (TopicEntity topicEntity : topicEntities) {
            topics.add(convertFromEntity(topicEntity));
        }
        return topics;
    }
}
