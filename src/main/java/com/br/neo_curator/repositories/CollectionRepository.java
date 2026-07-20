package com.br.neo_curator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entities.Collection;

public interface CollectionRepository extends JpaRepository<Collection, Long> {
    
}
