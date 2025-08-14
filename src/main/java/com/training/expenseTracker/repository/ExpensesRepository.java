package com.training.expenseTracker.repository;

import com.training.expenseTracker.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {
    boolean existsByCategory_Id(Integer categoryId);

    @Query("select count(e) from Expenses e where e.category.id = :categoryId")
    long countByCategoryId(Integer categoryId);
}
