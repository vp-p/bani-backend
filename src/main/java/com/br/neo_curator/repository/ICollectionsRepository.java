package com.br.neo_curator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.Collections;

public interface ICollectionsRepository extends JpaRepository<Collections, Long> {
    
}
