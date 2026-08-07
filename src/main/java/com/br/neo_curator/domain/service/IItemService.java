package com.br.neo_curator.domain.service;

import java.util.List;

import com.br.neo_curator.domain.entity.Item;

public interface IItemService {
    
    public Item findById(Long id);
    
    public Item newItem(Item item);

    public List<Item> findAll();
}
