package com.app.finances.infrastructure.repositories

import com.app.finances.domain.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository: CrudRepository<Account, String> {
}