package com.br.neo_curator.domain.service;

import java.util.List;

import com.br.neo_curator.domain.entity.Collections;

public interface ICollectionsService {
    
    public Collections findById(Long id);
    
    public Collections newCollection(Collections collection);
    
    public List<Collections> findAll();
}
