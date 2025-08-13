package com.training.expenseTracker.repository;

import com.training.expenseTracker.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {
    Boolean existsByName(String name);
}
