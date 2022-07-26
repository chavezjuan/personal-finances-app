package com.app.finances.application.services.impl

import com.app.finances.application.services.ExpenseService
import org.springframework.web.bind.annotation.RestController

@RestController
class ExpenseServiceImpl(val expenseService: ExpenseService) {
}