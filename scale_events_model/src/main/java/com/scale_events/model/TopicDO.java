package com.scale_events.model;

import java.util.Set;
import java.util.UUID;

public class TopicDO implements Topic {

    private UUID id;

    private String name;

    private String description;

    private SkillArea skillArea;

    private SeminarEvent seminarEvent;

    private Set<InternalTrainingEvent> internalTrainingEvents;

    private Category category;

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
    public SkillArea getSkillArea() {
        return skillArea;
    }

    @Override
    public SeminarEvent getSeminarEvent() {
        return seminarEvent;
    }

    @Override
    public Set<InternalTrainingEvent> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    @Override
    public Category getCategory() {
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
    public void setSkillArea(SkillArea skillArea) {
        this.skillArea = skillArea;
    }

    @Override
    public void setSeminarEvent(SeminarEvent seminarEvent) {
        this.seminarEvent = seminarEvent;
    }

    @Override
    public void setInternalTrainingEvents(Set<InternalTrainingEvent> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
    }

    @Override
    public void setCategory(Category category) {
        this.category = category;
    }
}
