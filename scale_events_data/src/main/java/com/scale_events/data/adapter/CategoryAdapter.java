package com.scale_events.data.adapter;

import com.scale_events.data.entity.CategoryEntity;
import com.scale_events.model.CategoryDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryAdapter {
    CategoryEntity convertToEntity(CategoryDO category);

    CategoryDO convertFromEntity(CategoryEntity categoryEntity);
}
