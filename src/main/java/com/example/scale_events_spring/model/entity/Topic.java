package com.example.scale_events_spring.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String description;

    @ManyToOne
    private SkillArea skillArea;

    @ManyToOne
    private SeminarEvent seminarEvent;

    @OneToMany(mappedBy = "topic")
    private Set<InternalTrainingEvent> internalTrainings;

    @ManyToOne
    private Category category;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public String getId() {
        return id;
    }

    public Topic setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Topic setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Topic setDescription(String description) {
        this.description = description;
        return this;
    }
}
