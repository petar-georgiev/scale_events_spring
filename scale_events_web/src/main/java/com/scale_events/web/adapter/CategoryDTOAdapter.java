package com.scale_events.web.adapter;

import com.scale_events.model.Category;
import com.scale_events.model.CategoryDO;
import com.scale_events.web.dto.CategoryDTO;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class CategoryDTOAdapter implements DTOAdapter<CategoryDTO, Category> {
    private final TopicDTOAdapter topicDTOAdapter;
    private final SkillAreaDTOAdapter skillAreaDTOAdapter;

    public CategoryDTOAdapter(TopicDTOAdapter topicAdapter, SkillAreaDTOAdapter skillAreaAdapter) {
        this.topicDTOAdapter = topicAdapter;
        this.skillAreaDTOAdapter = skillAreaAdapter;
    }

    @Override
    public CategoryDTO convertToDTO(Category category) {
        if (category == null) {
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setDescription(category.getDescription());
        categoryDTO.setTopics(topicDTOAdapter.convertToDTOSet(category.getTopics()));
        categoryDTO.setSkillArea(skillAreaDTOAdapter.convertToDTO(category.getSkillArea()));

        return categoryDTO;
    }

    @Override
    public Category convertFromDTO(CategoryDTO categoryDTO) {
        if (categoryDTO == null) {
            return null;
        }

        Category category = new CategoryDO();
        category.setId(categoryDTO.getId());
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());
        category.setTopics(topicDTOAdapter.convertFromDTOSet(categoryDTO.getTopics()));
        category.setSkillArea(skillAreaDTOAdapter.convertFromDTO(categoryDTO.getSkillArea()));

        return category;
    }

    protected Set<CategoryDTO> convertToDTOSet(Set<Category> categories) {
        if (categories == null) {
            return null;
        }
        Set<CategoryDTO> categoryDTOSet = new LinkedHashSet<>();
        for (Category category : categories) {
            categoryDTOSet.add(convertToDTO(category));
        }
        return categoryDTOSet;
    }

    protected Set<Category> convertFromDTOSet(Set<CategoryDTO> categoryDTOSet) {
        if (categoryDTOSet == null) {
            return null;
        }
        Set<Category> categories = new LinkedHashSet<>();
        for (CategoryDTO categoryDTO : categoryDTOSet) {
            categories.add(convertFromDTO(categoryDTO));
        }
        return categories;
    }
}
