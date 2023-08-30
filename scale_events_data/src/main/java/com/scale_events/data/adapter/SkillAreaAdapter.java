package com.scale_events.data.adapter;

import com.scale_events.data.entity.SkillAreaEntity;
import com.scale_events.model.SkillArea;
import com.scale_events.model.SkillAreaDO;

public class SkillAreaAdapter implements EntityAdapter<SkillAreaEntity, SkillArea> {

    private final TopicAdapter topicAdapter;
    private final CategoryAdapter categoryAdapter;


    public SkillAreaAdapter(TopicAdapter topicAdapter, CategoryAdapter categoryAdapter) {
        this.topicAdapter = topicAdapter;
        this.categoryAdapter = categoryAdapter;
    }

    @Override
    public SkillAreaEntity convertToEntity(SkillArea skillArea) {
        if(skillArea == null){
            return null;
        }
        SkillAreaEntity skillAreaEntity = new SkillAreaEntity();
        skillAreaEntity.setId(skillArea.getId());
        skillAreaEntity.setType(skillArea.getType());
        skillAreaEntity.setTopics(topicAdapter.convertToEntitySet(skillArea.getTopics()));
        skillAreaEntity.setCategories(categoryAdapter.convertToEntitySet(skillArea.getCategories()));

        return skillAreaEntity;
    }

    @Override
    public SkillArea convertFromEntity(SkillAreaEntity sAE) {
        if(sAE == null){
            return null;
        }
        SkillArea skillArea = new SkillAreaDO();
        skillArea.setId(sAE.getId());
        skillArea.setType(sAE.getType());
        skillArea.setTopics(topicAdapter.convertFromEntitySet(sAE.getTopics()));
        skillArea.setCategories(categoryAdapter.convertFromEntitySet(sAE.getCategories()));

        return skillArea;
    }
}
