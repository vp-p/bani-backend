package com.br.neo_curator.repository;
import java.util.List;
import java.util.Optional;

import com.br.neo_curator.entity.Item;

public interface ItemRepository extends IItemRepository {
    
    public Optional<Item> findByDescription(String description);
    public List<Item> findByDescriptionContaining(String description);
    public List<Item> findByTopicDescriptionContaining(String description);
    public List<Item> findByTopicId(Long id);
    public List<Item> findByCollectionDescriptionContaining(String description);
    public List<Item> findByCollectionId(Long id);
    
}
