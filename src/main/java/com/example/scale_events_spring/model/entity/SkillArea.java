package com.example.scale_events_spring.model.entity;

import com.example.scale_events_spring.model.entity.enums.SkillAreaTypeEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "skill_areas")
public class SkillArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    private SkillAreaTypeEnum type;


    @OneToMany(mappedBy = "skillArea")
    private Set<Topic> topics;

    @OneToMany(mappedBy = "skillArea")
    private Set<Category> category;

    public SkillArea() {
    }

    public SkillArea(Long id, SkillAreaTypeEnum type, Set<Topic> topics, Set<Category> category) {
        this.id = id;
        this.type = type;
        this.topics = topics;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public SkillArea setId(Long id) {
        this.id = id;
        return this;
    }

    public SkillAreaTypeEnum getType() {
        return type;
    }

    public SkillArea setType(SkillAreaTypeEnum type) {
        this.type = type;
        return this;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public SkillArea setTopics(Set<Topic> topics) {
        this.topics = topics;
        return this;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public SkillArea setCategory(Set<Category> category) {
        this.category = category;
        return this;
    }
}
