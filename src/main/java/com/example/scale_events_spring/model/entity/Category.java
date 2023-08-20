package com.example.scale_events_spring.model.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Topic> topics;

    @ManyToOne
    private SkillArea skillArea;

    public Category() {
    }

    public Category(Long id, String name, String description, Set<Topic> topics, SkillArea skillArea) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topics = topics;
        this.skillArea = skillArea;
    }

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public Category setTopics(Set<Topic> topics) {
        this.topics = topics;
        return this;
    }

    public SkillArea getSkillArea() {
        return skillArea;
    }

    public Category setSkillArea(SkillArea skillArea) {
        this.skillArea = skillArea;
        return this;
    }
}
