package com.scale_events.web.dto;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public  class TopicDTO {
    private  UUID id;
    private  String name;
    private  String description;
    private  SkillAreaDTO skillArea;
    private  SeminarEventDTO seminarEvent;
    private Set<InternalTrainingEventDTO> internalTrainingEvents;
    private  CategoryDTO category;

    public TopicDTO(UUID id, String name, String description, SkillAreaDTO skillArea, SeminarEventDTO seminarEvent, Set<InternalTrainingEventDTO> internalTrainingEvents, CategoryDTO category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.skillArea = skillArea;
        this.seminarEvent = seminarEvent;
        this.internalTrainingEvents = internalTrainingEvents;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public TopicDTO setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TopicDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TopicDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public SkillAreaDTO getSkillArea() {
        return skillArea;
    }

    public TopicDTO setSkillArea(SkillAreaDTO skillArea) {
        this.skillArea = skillArea;
        return this;
    }

    public SeminarEventDTO getSeminarEvent() {
        return seminarEvent;
    }

    public TopicDTO setSeminarEvent(SeminarEventDTO seminarEvent) {
        this.seminarEvent = seminarEvent;
        return this;
    }

    public Set<InternalTrainingEventDTO> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    public TopicDTO setInternalTrainingEvents(Set<InternalTrainingEventDTO> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
        return this;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public TopicDTO setCategory(CategoryDTO category) {
        this.category = category;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TopicDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.description, that.description) &&
                Objects.equals(this.skillArea, that.skillArea) &&
                Objects.equals(this.seminarEvent, that.seminarEvent) &&
                Objects.equals(this.internalTrainingEvents, that.internalTrainingEvents) &&
                Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, skillArea, seminarEvent, internalTrainingEvents, category);
    }

    @Override
    public String toString() {
        return "TopicDTO[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "description=" + description + ", " +
                "skillArea=" + skillArea + ", " +
                "seminarEvent=" + seminarEvent + ", " +
                "trainingEvent=" + internalTrainingEvents + ", " +
                "category=" + category + ']';
    }
}
