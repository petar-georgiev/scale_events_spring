package com.scale_events.model;

import java.util.Set;
import java.util.UUID;

public interface Topic {
    UUID getId();
    String getName();
    String getDescription();
    SkillArea getSkillArea();
    SeminarEvent getSeminarEvent();
    Set<InternalTrainingEvent> getInternalTrainingEvents();
    Category getCategory();
    void setId(UUID id);
    void setName(String name);
    void setDescription(String description);
    void setSkillArea(SkillArea skillArea);
    void setSeminarEvent(SeminarEvent seminarEvent);
    void setInternalTrainingEvents(Set<InternalTrainingEvent>internalTrainingEvents);
    void setCategory(Category category);
}
