package com.training.expenseTracker.service;

import com.training.expenseTracker.dto.expenses.ExpensesCreateDTO;
import com.training.expenseTracker.dto.expenses.ExpensesReadDTO;
import com.training.expenseTracker.repository.CategoriesRepository;
import com.training.expenseTracker.repository.ExpensesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpensesServiceImpl implements ExpensesService {
    private final ExpensesRepository expensesRepository;
    private final CategoriesRepository categoriesRepository;
    public ExpensesServiceImpl(ExpensesRepository expensesRepository, CategoriesRepository categoryRepository) {
        this.expensesRepository = expensesRepository;
        this.categoriesRepository = categoryRepository;
    }

    @Override
    public ExpensesReadDTO create(ExpensesCreateDTO dto) {
        return null;
    }

    @Override
    public ExpensesReadDTO update(Long id, ExpensesCreateDTO dto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ExpensesReadDTO getById(Long id) {
        return null;
    }

    @Override
    public Page<ExpensesReadDTO> search(LocalDate from, LocalDate to, int categoryId, Pageable pageable) {
        return null;
    }

    @Override
    public BigDecimal total(LocalDate from, LocalDate to, int categoryId) {
        return null;
    }

    @Override
    public List<ExpensesReadDTO> allExpenses() {
        return List.of();
    }

    @Override
    public List<ExpensesReadDTO> allExpensesByCategory(int categoryId) {
        return List.of();
    }

    @Override
    public List<ExpensesReadDTO> allExpensesByCategoryAndDate(LocalDate from, LocalDate to, int categoryId) {
        return List.of();
    }
}
