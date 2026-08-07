package com.br.bani_backend.service;

import java.util.List;

import com.br.bani_backend.entity.Item;

public interface IItemService {
    
    public Item findById(Long id);
    
    public Item newItem(Item item);

    public List<Item> findAll();
}
