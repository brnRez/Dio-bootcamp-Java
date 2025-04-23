package com.edu.bancodigital.bancodigital.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.bancodigital.bancodigital.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByDocument(String document);
    boolean existsByDocument(String document);
    
    Optional<User> findById(Long id);
    boolean existsById(Long id);
}
