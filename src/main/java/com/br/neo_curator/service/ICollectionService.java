package com.br.neo_curator.service;

import java.util.List;

import com.br.neo_curator.entity.Collection;

public interface ICollectionService {
    
    public Collection findById(Long id);
    
    public Collection newCollection(Collection collection);
    
    public List<Collection> findAll();
}
