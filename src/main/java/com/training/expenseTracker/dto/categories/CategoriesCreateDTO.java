package com.training.expenseTracker.dto.categories;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoriesCreateDTO {
    private String categoryName;
    private String categoryColor;
}
