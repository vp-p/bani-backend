package com.br.neo_curator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    
}
