package com.br.neo_curator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.NeoUser;

public interface NeoUserRepository extends JpaRepository<NeoUser, Long> {
    
}
