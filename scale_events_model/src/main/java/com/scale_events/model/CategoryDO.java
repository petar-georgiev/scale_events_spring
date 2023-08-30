package com.scale_events.model;

import java.util.Set;

public class CategoryDO implements Category {
    private Long id;

    private String name;

    private String description;

    private Set<Topic> topics;

    private SkillArea skillArea;


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
    public Set<Topic> getTopics() {
        return topics;
    }

    @Override
    public SkillArea getSkillArea() {
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
    public void setTopics(Set<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public void setSkillArea(SkillArea skillArea) {
        this.skillArea = skillArea;
    }
}
