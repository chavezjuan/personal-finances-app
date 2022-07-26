package com.app.finances.infrastructure.repositories

import com.app.finances.domain.Expense
import org.springframework.data.repository.CrudRepository

interface ExpenseRepository : CrudRepository<Expense, String>{
}