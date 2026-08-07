package com.br.bani_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.br.bani_backend.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
        
    public Optional<User> findById(String id);
    UserDetails findByUsername(String username);
    public Optional<User> findByUsernameAndPassword(String username, String password);
}
