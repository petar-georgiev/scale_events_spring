package com.scale_events.data.entity;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "topics")
public class TopicEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String name;

    private String description;

    @ManyToOne
    private SkillAreaEntity skillArea;

    @ManyToOne
    private SeminarEventEntity seminarEvent;

    @OneToMany(mappedBy = "topic")
    private Set<InternalTrainingEventEntity> internalTrainingEvents;

    @ManyToOne
    private CategoryEntity category;

    public TopicEntity() {
    }

    public TopicEntity(UUID id, String name, String description, SkillAreaEntity skillArea, SeminarEventEntity seminarEvent, Set<InternalTrainingEventEntity> internalTrainingEvents, CategoryEntity category) {
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

    public TopicEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TopicEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TopicEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public SkillAreaEntity getSkillArea() {
        return skillArea;
    }

    public TopicEntity setSkillArea(SkillAreaEntity skillArea) {
        this.skillArea = skillArea;
        return this;
    }

    public SeminarEventEntity getSeminarEvent() {
        return seminarEvent;
    }

    public TopicEntity setSeminarEvent(SeminarEventEntity seminarEvent) {
        this.seminarEvent = seminarEvent;
        return this;
    }

    public Set<InternalTrainingEventEntity> getInternalTrainingEvents() {
        return internalTrainingEvents;
    }

    public TopicEntity setInternalTrainingEvents(Set<InternalTrainingEventEntity> internalTrainingEvents) {
        this.internalTrainingEvents = internalTrainingEvents;
        return this;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public TopicEntity setCategory(CategoryEntity category) {
        this.category = category;
        return this;
    }
}
