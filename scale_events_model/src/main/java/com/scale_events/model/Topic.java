package com.scale_events.model;

import java.util.Set;
import java.util.UUID;

public interface Topic {
    UUID getId();

    String getName();

    String getDescription();

    SkillAreaDO getSkillArea();

    SeminarEventDO getSeminarEvent();

    Set<InternalTrainingEventDO> getInternalTrainingEvents();

    CategoryDO getCategory();

    void setId(UUID id);

    void setName(String name);

    void setDescription(String description);

    void setSkillArea(SkillAreaDO skillArea);

    void setSeminarEvent(SeminarEventDO seminarEvent);

    void setInternalTrainingEvents(Set<InternalTrainingEventDO> internalTrainingEvents);

    void setCategory(CategoryDO category);
}
