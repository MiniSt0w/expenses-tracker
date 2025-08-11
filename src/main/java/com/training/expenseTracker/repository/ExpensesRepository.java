package com.training.expenseTracker.repository;

import com.training.expenseTracker.entity.Expenses;
import org.springframework.data.repository.CrudRepository;

public interface ExpensesRepository extends CrudRepository<Expenses, Long> {

}
