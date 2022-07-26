package com.app.finances.domain

import java.util.*

data class Expense(
    val name: String,
    val type: Enum<Type>,
    val date: Date,
    val value: Double = 0.0
)
