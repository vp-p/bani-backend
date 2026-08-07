package com.br.bani_backend.service;

import java.util.List;

import com.br.bani_backend.entity.Collections;

public interface ICollectionsService {
    
    public Collections findById(Long id);
    
    public Collections newCollection(Collections collection);
    
    public List<Collections> findAll();
}
