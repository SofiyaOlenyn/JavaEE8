package com.example.javaee8.repository;

import com.example.javaee8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsernameIgnoreCase(String username);
    Optional<User> findUserByEmailIgnoreCase(String email);
}