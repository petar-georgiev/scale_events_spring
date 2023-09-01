package com.scale_events.web.adapter;

import com.scale_events.model.SkillAreaDO;
import com.scale_events.web.dto.SkillAreaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillAreaDTOAdapter {
    public SkillAreaDTO convertToDTO(SkillAreaDO skillArea);

    public SkillAreaDO convertFromDTO(SkillAreaDTO skillAreaDTO);
}
