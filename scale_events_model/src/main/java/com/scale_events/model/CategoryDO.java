package com.scale_events.model;

import java.util.Set;

public class CategoryDO implements Category {
    private Long id;
    private String name;
    private String description;
    private Set<TopicDO> topics;
    private SkillAreaDO skillArea;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Set<TopicDO> getTopics() {
        return topics;
    }

    @Override
    public SkillAreaDO getSkillArea() {
        return skillArea;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setTopics(Set<TopicDO> topics) {
        this.topics = topics;
    }

    @Override
    public void setSkillArea(SkillAreaDO skillArea) {
        this.skillArea = skillArea;
    }

}
