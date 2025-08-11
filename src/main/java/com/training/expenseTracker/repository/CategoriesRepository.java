package com.training.expenseTracker.repository;

import com.training.expenseTracker.entity.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories, Integer> {

}
