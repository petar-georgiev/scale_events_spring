package com.scale_events.model;

import java.util.Set;

public interface Category {
    Long getId();

    String getName();

    String getDescription();

    Set<TopicDO> getTopics();

    SkillAreaDO getSkillArea();

    void setId(Long id);

    void setName(String name);

    void setDescription(String description);

    void setTopics(Set<TopicDO> topics);

    void setSkillArea(SkillAreaDO skillArea);
}
