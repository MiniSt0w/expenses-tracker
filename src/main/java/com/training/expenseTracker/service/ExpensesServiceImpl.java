package com.training.expenseTracker.service;

import com.training.expenseTracker.repository.CategoriesRepository;
import com.training.expenseTracker.repository.ExpensesRepository;
import org.springframework.stereotype.Service;

@Service
public class ExpensesServiceImpl implements ExpensesService {
    private final ExpensesRepository expensesRepository;
    private final CategoriesRepository categoriesRepository;
    public ExpensesServiceImpl(ExpensesRepository expensesRepository, CategoriesRepository categoryRepository) {
        this.expensesRepository = expensesRepository;
        this.categoriesRepository = categoryRepository;
    }
}
