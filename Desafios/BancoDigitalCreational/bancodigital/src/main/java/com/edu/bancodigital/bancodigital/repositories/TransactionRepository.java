package com.edu.bancodigital.bancodigital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.bancodigital.bancodigital.domain.Transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> { 
}
