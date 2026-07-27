package com.br.neo_curator.repository;

import java.util.List;
import java.util.Optional;

import com.br.neo_curator.entity.Collection;

public interface CollectionRepository extends ICollectionRepository {
    
    public Optional<Collection> findByDescription(String description);
    public List<Collection> findByDescriptionContaining(String description);

}
