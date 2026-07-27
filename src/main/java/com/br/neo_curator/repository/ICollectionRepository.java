package com.br.neo_curator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.Collection;

public interface ICollectionRepository extends JpaRepository<Collection, Long> {
    
}
