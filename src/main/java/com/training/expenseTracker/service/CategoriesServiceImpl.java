package com.training.expenseTracker.service;

import com.training.expenseTracker.dto.categories.CategoriesCreateDTO;
import com.training.expenseTracker.dto.categories.CategoriesReadDTO;
import com.training.expenseTracker.repository.CategoriesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService{
    private final CategoriesRepository categoriesRepository;
    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public CategoriesReadDTO create(CategoriesCreateDTO dto) {
        return null;
    }

    @Override
    public CategoriesReadDTO update(Long id, CategoriesCreateDTO dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public CategoriesReadDTO getById(Long id) {
        return null;
    }

    @Override
    public List<CategoriesReadDTO> findAll() {
        return List.of();
    }

    @Override
    public boolean existsByName(String name) {
        return false;
    }

    @Override
    public void rename(Long id, String newName) {

    }


}
