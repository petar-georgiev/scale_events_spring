package com.scale_events.web.dto;

import java.util.Objects;
import java.util.Set;

public class CategoryDTO {
    private  Long id;
    private  String name;
    private  String description;
    private  Set<TopicDTO> topics;
    private  SkillAreaDTO skillArea;

    public CategoryDTO(Long id, String name, String description, Set<TopicDTO> topics, SkillAreaDTO skillArea) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topics = topics;
        this.skillArea = skillArea;
    }

    public Long getId() {
        return id;
    }

    public CategoryDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<TopicDTO> getTopics() {
        return topics;
    }

    public CategoryDTO setTopics(Set<TopicDTO> topics) {
        this.topics = topics;
        return this;
    }

    public SkillAreaDTO getSkillArea() {
        return skillArea;
    }

    public CategoryDTO setSkillArea(SkillAreaDTO skillArea) {
        this.skillArea = skillArea;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CategoryDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.name, that.name) &&
                Objects.equals(this.description, that.description) &&
                Objects.equals(this.topics, that.topics) &&
                Objects.equals(this.skillArea, that.skillArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, topics, skillArea);
    }

    @Override
    public String toString() {
        return "CategoryDTO[" +
                "id=" + id + ", " +
                "name=" + name + ", " +
                "description=" + description + ", " +
                "topics=" + topics + ", " +
                "skillArea=" + skillArea + ']';
    }
}
