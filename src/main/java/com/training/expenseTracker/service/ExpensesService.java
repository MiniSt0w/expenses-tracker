package com.training.expenseTracker.service;

import com.training.expenseTracker.dto.expenses.ExpensesCreateDTO;
import com.training.expenseTracker.dto.expenses.ExpensesReadDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ExpensesService {
    ExpensesReadDTO create(ExpensesCreateDTO dto);
    ExpensesReadDTO update(Long id, ExpensesCreateDTO dto);
    void delete(Long id);
    ExpensesReadDTO getById(Long id);
    Page<ExpensesReadDTO> search(
                                                                   LocalDate from,
                                                                   LocalDate to,
                                                                   int categoryId,
                                                                   Pageable pageable
    );
    BigDecimal total(LocalDate from, LocalDate to, int categoryId);
    List<ExpensesReadDTO> allExpenses();
    List<ExpensesReadDTO> allExpensesByCategory(int categoryId);
    List<ExpensesReadDTO> allExpensesByCategoryAndDate(LocalDate from, LocalDate to, int categoryId);


}
