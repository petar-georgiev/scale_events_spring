package com.scale_events.model;

import java.util.Set;
import java.util.UUID;

public class TopicDO implements Topic {
    private UUID id;

    private String name;

    private String description;

    private SkillAreaDO skillArea;

    private SeminarEventDO seminarEvent;

    private Set<InternalTrainingEventDO> internalTrainingEvents;

    private CategoryDO category;

    @Override
    public UUID getId() {
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
    public SkillAreaDO getSkillArea() {
        return skillArea;
    }

    @Override
    public SeminarEventDO getSeminarEvent() {
        return seminarEvent;
    }

    @Override
    public Set<InternalTrainingEventDO> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    @Override
    public CategoryDO getCategory() {
        return category;
    }

    @Override
    public void setId(UUID id) {
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
    public void setSkillArea(SkillAreaDO skillArea) {
        this.skillArea = skillArea;
    }

    @Override
    public void setSeminarEvent(SeminarEventDO seminarEvent) {
        this.seminarEvent = seminarEvent;
    }

    @Override
    public void setInternalTrainingEvents(Set<InternalTrainingEventDO> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
    }

    @Override
    public void setCategory(CategoryDO category) {
        this.category = category;
    }
}
