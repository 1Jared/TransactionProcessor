package com.transactionprocessing.transactionsystem.repositories;

import com.transactionprocessing.transactionsystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
