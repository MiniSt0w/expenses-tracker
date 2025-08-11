package com.training.expenseTracker.service;

import com.training.expenseTracker.dto.categories.CategoriesCreateDTO;
import com.training.expenseTracker.dto.categories.CategoriesReadDTO;

import java.util.List;

public interface CategoriesService {
    CategoriesReadDTO create(CategoriesCreateDTO dto);
    CategoriesReadDTO update(Long id, CategoriesCreateDTO dto);
    void delete(Long id);
    CategoriesReadDTO getById(Long id);
    List<CategoriesReadDTO> findAll();
    boolean existsByName(String name);
    void rename(Long id, String newName);
}
