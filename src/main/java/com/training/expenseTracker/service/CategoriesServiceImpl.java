package com.training.expenseTracker.service;

import com.training.expenseTracker.repository.CategoriesRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl implements CategoriesService{
    private final CategoriesRepository categoriesRepository;
    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }
}
