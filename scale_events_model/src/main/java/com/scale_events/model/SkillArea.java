package com.scale_events.model;

import com.scale_events.model.enums.SkillAreaTypeEnum;

import java.util.Set;

public interface SkillArea {

    Long getId();

    SkillAreaTypeEnum getType();

    Set<TopicDO> getTopics();

    Set<CategoryDO> getCategories();

    void setId(Long id);

    void setType(SkillAreaTypeEnum type);

    void setTopics(Set<TopicDO> topics);

    void setCategories(Set<CategoryDO> categories);

}
