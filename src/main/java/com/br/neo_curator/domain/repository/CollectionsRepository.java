package com.br.neo_curator.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.domain.entity.Collections;

public interface CollectionsRepository extends JpaRepository<Collections, Long> {
    
    public Optional<Collections> findByDescription(String description);
    public List<Collections> findByDescriptionContaining(String description);

}
