package com.training.expenseTracker.mapper.categories;

import com.training.expenseTracker.dto.categories.CategoriesReadDTO;
import com.training.expenseTracker.entity.Categories;
import com.training.expenseTracker.entity.Expenses;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoriesReadMapper {
    @Mapping(source = "id", target = "categoryId")
    @Mapping(source = "name", target = "categoryName")
    @Mapping(source = "color", target = "categoryColor")
    CategoriesReadDTO toDto(Categories category);
}
