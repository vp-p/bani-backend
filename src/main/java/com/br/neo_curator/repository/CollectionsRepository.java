package com.br.neo_curator.repository;

import java.util.List;
import java.util.Optional;

import com.br.neo_curator.entity.Collections;

public interface CollectionsRepository extends ICollectionsRepository {
    
    public Optional<Collections> findByDescription(String description);
    public List<Collections> findByDescriptionContaining(String description);

}
