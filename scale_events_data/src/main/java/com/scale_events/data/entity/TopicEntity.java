package com.scale_events.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;
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

    public TopicEntity(UUID id, String name, String description,
                       SkillAreaEntity skillArea, SeminarEventEntity seminarEvent,
                       Set<InternalTrainingEventEntity> internalTrainingEvents, CategoryEntity category) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicEntity that = (TopicEntity) o;
        return getId().equals(that.getId()) && Objects.equals(getName(),
                that.getName()) && Objects.equals(getDescription(),
                that.getDescription()) && Objects.equals(getSkillArea(),
                that.getSkillArea()) && Objects.equals(getSeminarEvent(),
                that.getSeminarEvent()) && Objects.equals(getInternalTrainingEvents(),
                that.getInternalTrainingEvents()) && Objects.equals(getCategory(), that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getSkillArea(), getSeminarEvent(), getInternalTrainingEvents(), getCategory());
    }
}
