package com.br.neo_curator.repository;

import java.util.List;
import java.util.Optional;

import com.br.neo_curator.entity.Collection;

public interface CollectionRepositoryImpl extends CollectionRepository {
    
    public Optional<Collection> findByDescription(String description);
    public List<Collection> findByDescriptionContaining(String description);
    public List<Collection> findByNeoUserId(Long id);
    public List<Collection> findByItemContainingDescription(String description);
}
