package com.training.expenseTracker.mapper;

import com.training.expenseTracker.dto.expenses.ExpensesReadDTO;
import com.training.expenseTracker.entity.Categories;
import com.training.expenseTracker.entity.Expenses;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExpensesReadMapper {

    @Mapping(source = "id", target = "expenseId")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "date", target = "date")
    @Mapping(target = "expenseCategory", expression = "java(toCategoryDto(expense.getCategory()))")
    ExpensesReadDTO toDto(Expenses expense);

    default ExpensesReadDTO.ExpenseCategory toCategoryDto(Categories category) {
        return new ExpensesReadDTO.ExpenseCategory(
                category.getId(),
                category.getName(),
                category.getColor()
        );
    }
}
