package com.scale_events.model;

import com.scale_events.model.enums.SkillAreaTypeEnum;

import java.util.Set;

public interface SkillArea {

    Long getId();

    SkillAreaTypeEnum getType();

    Set<Topic> getTopics();


    Set<Category> getCategories();

    void setId(Long id);

    void setType(SkillAreaTypeEnum type);

    void setTopics(Set<Topic> topics);

    void setCategories(Set<Category>categories);

}
