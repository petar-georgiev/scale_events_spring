package com.scale_events.model;

import java.util.Set;

public interface Category {

    Long getId();
    String getName();
    String getDescription();
    Set<Topic> getTopics();
    SkillArea getSkillArea();

    void setId(Long id);
    void setName(String name);
    void setDescription(String description);
    void setTopics(Set<Topic>topics);
    void setSkillArea(SkillArea skillArea);
}
