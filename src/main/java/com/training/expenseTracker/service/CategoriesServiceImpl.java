package com.training.expenseTracker.service;

import com.training.expenseTracker.dto.categories.CategoriesCreateDTO;
import com.training.expenseTracker.dto.categories.CategoriesReadDTO;
import com.training.expenseTracker.dto.categories.CategoriesUpdateDTO;
import com.training.expenseTracker.entity.Categories;
import com.training.expenseTracker.exceptions.ApiException;
import com.training.expenseTracker.mapper.categories.CategoriesCreateMapper;
import com.training.expenseTracker.mapper.categories.CategoriesReadMapper;
import com.training.expenseTracker.mapper.categories.CategoriesUpdateMapper;
import com.training.expenseTracker.repository.CategoriesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServiceImpl implements CategoriesService{
    private final CategoriesRepository categoriesRepository;
    private final CategoriesCreateMapper categoriesCreateMapper;
    private final CategoriesReadMapper categoriesReadMapper;
    private final CategoriesUpdateMapper categoriesUpdateMapper;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository, CategoriesCreateMapper categoriesCreateMapper, CategoriesReadMapper categoriesReadMapper, CategoriesUpdateMapper categoriesUpdateMapper) {
        this.categoriesRepository = categoriesRepository;
        this.categoriesCreateMapper = categoriesCreateMapper;
        this.categoriesReadMapper = categoriesReadMapper;
        this.categoriesUpdateMapper = categoriesUpdateMapper;
    }

    @Override
    public CategoriesReadDTO create(CategoriesCreateDTO categoriesCreateDTO) {

        Categories categories= categoriesCreateMapper.toEntity(categoriesCreateDTO);
        categories = categoriesRepository.save(categories);
        return categoriesReadMapper.toDto(categories);
    }

    @Override
    @Transactional
    public CategoriesReadDTO update(Integer id, CategoriesUpdateDTO categoriesUpdateDTO) {
        Optional<Categories> categories=categoriesRepository.findById(id);
        if(categories.isEmpty()){
            throw new ApiException("Category not found", HttpStatus.NOT_FOUND);
        }
        Categories category=categories.get();
        categoriesUpdateMapper.updateFromDto(categoriesUpdateDTO, category);
        Categories savedCategories=categoriesRepository.save(category);
        return categoriesReadMapper.toDto(savedCategories);
    }

    @Override
    public void delete(Integer id) {
        Optional<Categories> categories=categoriesRepository.findById(id);
        if(categories.isEmpty()){
            throw new ApiException("Category not found", HttpStatus.NOT_FOUND);
        }
        categoriesRepository.deleteById(id);
    }

    @Override
    public CategoriesReadDTO getById(Integer id) {
        Optional<Categories> categories=categoriesRepository.findById(id);
        if(categories.isEmpty()){
            throw new ApiException("Category not found", HttpStatus.NOT_FOUND);
        }
        Categories category=categories.get();
        return categoriesReadMapper.toDto(category);
    }

    @Override
    public List<CategoriesReadDTO> findAll() {
        List<Categories> categories = categoriesRepository.findAll();
        return categories.stream()
                .map(categoriesReadMapper::toDto)
                .toList(); // Java 16+
    }

    @Override
    public boolean existsByName(String name) {
        return categoriesRepository.existsByName(name);
    }

    @Override
    public void rename(Integer id, String newName) {
        Optional<Categories> categories=categoriesRepository.findById(id);
        if(categories.isEmpty()){
            throw new ApiException("Category not found", HttpStatus.NOT_FOUND);
        }
        Categories category=categories.get();
        category.setName(newName);
        categoriesRepository.save(category);

    }


}
