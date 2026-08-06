package com.br.neo_curator.service;

import java.util.List;

import com.br.neo_curator.entity.Collections;

public interface ICollectionService {
    
    public Collections findById(Long id);
    
    public Collections newCollection(Collections collection);
    
    public List<Collections> findAll();
}
