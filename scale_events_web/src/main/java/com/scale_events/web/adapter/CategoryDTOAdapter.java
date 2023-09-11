package com.scale_events.web.adapter;

import com.scale_events.model.CategoryDO;
import com.scale_events.web.dto.CategoryDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryDTOAdapter {
    CategoryDTO convertToDTO(CategoryDO category);

    CategoryDO convertFromDTO(CategoryDTO categoryDTO);
}
