package com.br.neo_curator.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.br.neo_curator.domain.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
        
    public Optional<User> findById(String id);
    UserDetails findByUsername(String username);
    public Optional<User> findByUsernameAndPassword(String username, String password);
}
