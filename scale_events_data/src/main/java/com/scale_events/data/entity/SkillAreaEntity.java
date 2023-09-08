package com.scale_events.data.entity;

import com.scale_events.model.enums.SkillAreaTypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillAreaEntity that = (SkillAreaEntity) o;
        return getId().equals(that.getId()) &&
                getType() == that.getType() && Objects.equals(getTopics(),
                that.getTopics()) && Objects.equals(getCategories(), that.getCategories());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getTopics(), getCategories());
    }

    @Override
    public String toString() {
        return "SkillAreaEntity{" +
                "id=" + id +
                ", type=" + type +
                ", topics=" + topics +
                ", categories=" + categories +
                '}';
    }
}
