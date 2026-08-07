package com.br.neo_curator.service;

import java.util.List;

import com.br.neo_curator.entity.Item;

public interface IItemService {
    
    public Item findById(Long id);
    
    public Item newItem(Item item);

    public List<Item> findAll();
}
