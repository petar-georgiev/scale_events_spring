package com.scale_events.data.entity;

import com.scale_events.model.enums.SkillAreaTypeEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "skill_areas")
public class SkillAreaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SkillAreaTypeEnum type;

    @OneToMany(mappedBy = "skillArea")
    private Set<TopicEntity> topics;

    @OneToMany(mappedBy = "skillArea")
    private Set<CategoryEntity> categories;

    public SkillAreaEntity() {
    }

    public SkillAreaEntity(Long id, SkillAreaTypeEnum type, Set<TopicEntity> topics, Set<CategoryEntity> categories) {
        this.id = id;
        this.type = type;
        this.topics = topics;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public SkillAreaEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public SkillAreaTypeEnum getType() {
        return type;
    }

    public SkillAreaEntity setType(SkillAreaTypeEnum type) {
        this.type = type;
        return this;
    }

    public Set<TopicEntity> getTopics() {
        return topics;
    }

    public SkillAreaEntity setTopics(Set<TopicEntity> topics) {
        this.topics = topics;
        return this;
    }

    public Set<CategoryEntity> getCategories() {
        return categories;
    }

    public SkillAreaEntity setCategories(Set<CategoryEntity> categories) {
        this.categories = categories;
        return this;
    }
}
