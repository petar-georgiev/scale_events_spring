package com.scale_events.web.dto;


import com.scale_events.model.enums.SkillAreaTypeEnum;

import java.util.Objects;
import java.util.Set;

public  class SkillAreaDTO {
    private  Long id;
    private  SkillAreaTypeEnum type;
    private  Set<TopicDTO> topics;
    private  Set<CategoryDTO> categories;

    public SkillAreaDTO() {
    }

    public SkillAreaDTO(Long id, SkillAreaTypeEnum type, Set<TopicDTO> topics, Set<CategoryDTO> categories) {
        this.id = id;
        this.type = type;
        this.topics = topics;
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public SkillAreaDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public SkillAreaTypeEnum getType() {
        return type;
    }

    public SkillAreaDTO setType(SkillAreaTypeEnum type) {
        this.type = type;
        return this;
    }

    public Set<TopicDTO> getTopics() {
        return topics;
    }

    public SkillAreaDTO setTopics(Set<TopicDTO> topics) {
        this.topics = topics;
        return this;
    }

    public Set<CategoryDTO> getCategories() {
        return categories;
    }

    public SkillAreaDTO setCategories(Set<CategoryDTO> categories) {
        this.categories = categories;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (SkillAreaDTO) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.type, that.type) &&
                Objects.equals(this.topics, that.topics) &&
                Objects.equals(this.categories, that.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, topics, categories);
    }

    @Override
    public String toString() {
        return "SkillAreaDTO[" +
                "id=" + id + ", " +
                "type=" + type + ", " +
                "topics=" + topics + ", " +
                "categories=" + categories + ']';
    }

}
