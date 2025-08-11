package com.training.expenseTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="expenses")
@Data
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private Date date;
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;


}
