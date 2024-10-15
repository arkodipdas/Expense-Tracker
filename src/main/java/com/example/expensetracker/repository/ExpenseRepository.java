package com.example.expensetracker.repository;

import com.example.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Marks as spring data repo
public interface ExpenseRepository extends JpaRepository<Expense, Long> //Spring data jpa interface that provides CRUD and helps in interacting with the DB
{
}
