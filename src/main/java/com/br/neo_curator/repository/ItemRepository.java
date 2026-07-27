package com.br.neo_curator.repository;
import com.br.neo_curator.entity.Item;

public interface ItemRepository extends ItemRepository {
    
    public Item findByDescription(String description);
    
}
