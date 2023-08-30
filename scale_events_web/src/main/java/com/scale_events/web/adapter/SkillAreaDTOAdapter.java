package com.scale_events.web.adapter;

import com.scale_events.model.SkillArea;
import com.scale_events.model.SkillAreaDO;
import com.scale_events.web.dto.SkillAreaDTO;
import org.springframework.stereotype.Component;

@Component
public class SkillAreaDTOAdapter implements DTOAdapter<SkillAreaDTO, SkillArea> {
    private final TopicDTOAdapter topicDTOAdapter;
    private final CategoryDTOAdapter categoryDTOAdapter;

    public SkillAreaDTOAdapter(TopicDTOAdapter topicDTOAdapter, CategoryDTOAdapter categoryDTOAdapter) {
        this.topicDTOAdapter = topicDTOAdapter;
        this.categoryDTOAdapter = categoryDTOAdapter;
    }


    @Override
    public SkillAreaDTO convertToDTO(SkillArea skillArea) {
        if(skillArea == null){
            return null;
        }
        SkillAreaDTO skillAreaDTO = new SkillAreaDTO();
        skillAreaDTO.setId(skillArea.getId());
        skillAreaDTO.setType(skillArea.getType());
        skillAreaDTO.setTopics(topicDTOAdapter.convertToDTOSet(skillArea.getTopics()));
        skillAreaDTO.setCategories(categoryDTOAdapter.convertToDTOSet(skillArea.getCategories()));

        return skillAreaDTO;
    }
    @Override
    public SkillArea convertFromDTO(SkillAreaDTO skillAreaDTO) {
        if(skillAreaDTO == null){
            return null;
        }

        SkillArea skillArea = new SkillAreaDO();
        skillArea.setId(skillAreaDTO.getId());
        skillArea.setType(skillAreaDTO.getType());
        skillArea.setTopics(topicDTOAdapter.convertFromDTOSet(skillAreaDTO.getTopics()));
        skillArea.setCategories(categoryDTOAdapter.convertFromDTOSet(skillAreaDTO.getCategories()));

        return skillArea;
    }
}
