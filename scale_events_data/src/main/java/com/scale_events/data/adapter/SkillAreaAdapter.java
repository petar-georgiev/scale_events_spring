package com.scale_events.data.adapter;

import com.scale_events.data.entity.SkillAreaEntity;
import com.scale_events.model.SkillAreaDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkillAreaAdapter  {

    public SkillAreaEntity convertToEntity(SkillAreaDO skillArea);

    public SkillAreaDO convertFromEntity(SkillAreaEntity sAE);
}
