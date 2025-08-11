package com.training.expenseTracker.dto.categories;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class CategoriesReadDTO {
    private int categoryId;
    private String categoryName;
    private String categoryColor;
}
