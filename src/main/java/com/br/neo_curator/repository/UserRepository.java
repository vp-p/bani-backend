package com.br.neo_curator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUserName(String userName);
    public Optional<User> findByUserNameAndPassword(String userName, String password);
}
