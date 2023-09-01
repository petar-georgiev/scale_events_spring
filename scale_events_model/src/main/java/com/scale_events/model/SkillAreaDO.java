package com.scale_events.model;

import com.scale_events.model.enums.SkillAreaTypeEnum;

import java.util.Set;

public class SkillAreaDO implements SkillArea {
    private Long id;

    private SkillAreaTypeEnum type;

    private Set<TopicDO> topics;

    private Set<CategoryDO> categories;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public SkillAreaTypeEnum getType() {
        return type;
    }

    @Override
    public Set<TopicDO> getTopics() {
        return topics;
    }

    @Override
    public Set<CategoryDO> getCategories() {
        return categories;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setType(SkillAreaTypeEnum type) {
        this.type = type;
    }

    @Override
    public void setTopics(Set<TopicDO> topics) {
        this.topics = topics;
    }

    @Override
    public void setCategories(Set<CategoryDO> categories) {
        this.categories = categories;
    }
}
