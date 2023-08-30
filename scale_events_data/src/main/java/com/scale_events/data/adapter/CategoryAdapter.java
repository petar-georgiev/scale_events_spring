package com.scale_events.data.adapter;

import com.scale_events.data.entity.CategoryEntity;
import com.scale_events.model.Category;
import com.scale_events.model.CategoryDO;

import java.util.LinkedHashSet;
import java.util.Set;

public class CategoryAdapter implements EntityAdapter<CategoryEntity, Category> {

    private final TopicAdapter topicAdapter;
    private final SkillAreaAdapter skillAreaAdapter;

    public CategoryAdapter(TopicAdapter topicAdapter, SkillAreaAdapter skillAreaAdapter) {
        this.topicAdapter = topicAdapter;
        this.skillAreaAdapter = skillAreaAdapter;
    }

    @Override
    public CategoryEntity convertToEntity(Category category) {
        if(category == null){
            return null;
        }
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setId(category.getId());
        categoryEntity.setName(category.getName());
        categoryEntity.setDescription(category.getDescription());
        categoryEntity.setTopics(topicAdapter.convertToEntitySet(category.getTopics()));
        categoryEntity.setSkillArea(skillAreaAdapter.convertToEntity(category.getSkillArea()));

        return categoryEntity;
    }

    @Override
    public Category convertFromEntity(CategoryEntity categoryEntity) {
        if(categoryEntity == null){
            return null;
        }
        Category category = new CategoryDO();
        category.setId(categoryEntity.getId());
        category.setName(categoryEntity.getName());
        category.setDescription(categoryEntity.getDescription());
        category.setTopics(topicAdapter.convertFromEntitySet(categoryEntity.getTopics()));
        category.setSkillArea(skillAreaAdapter.convertFromEntity(categoryEntity.getSkillArea()));

        return category;
    }

    protected Set<CategoryEntity> convertToEntitySet(Set<Category> categories) {
        if (categories == null) {
            return null;
        }
        Set<CategoryEntity> categoryEntities = new LinkedHashSet<>();
        for (Category category : categories) {
            categoryEntities.add(convertToEntity(category));
        }
        return categoryEntities;
    }

    protected Set<Category> convertFromEntitySet(Set<CategoryEntity> categoryEntities) {
        if (categoryEntities == null) {
            return null;
        }
        Set<Category> categories = new LinkedHashSet<>();
        for (CategoryEntity categoryEntity : categoryEntities) {
            categories.add(convertFromEntity(categoryEntity));
        }
        return categories;
    }
}
