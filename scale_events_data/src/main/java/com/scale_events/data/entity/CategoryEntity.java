package com.scale_events.data.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "category")
    private Set<TopicEntity> topics;

    @ManyToOne
    private SkillAreaEntity skillArea;

    public CategoryEntity() {
    }

    public CategoryEntity(Long id, String name, String description, Set<TopicEntity> topics, SkillAreaEntity skillArea) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topics = topics;
        this.skillArea = skillArea;
    }

    public Long getId() {
        return id;
    }

    public CategoryEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<TopicEntity> getTopics() {
        return topics;
    }

    public CategoryEntity setTopics(Set<TopicEntity> topics) {
        this.topics = topics;
        return this;
    }

    public SkillAreaEntity getSkillArea() {
        return skillArea;
    }

    public CategoryEntity setSkillArea(SkillAreaEntity skillArea) {
        this.skillArea = skillArea;
        return this;
    }
}
