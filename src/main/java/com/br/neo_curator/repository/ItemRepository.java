package com.br.neo_curator.repository;
import java.util.List;
import java.util.Optional;

import com.br.neo_curator.entity.Item;
import com.br.neo_curator.entity.enums.ItemType;

public interface ItemRepository extends IItemRepository {
    
    public Optional<Item> findByDescription(String description);
    public List<Item> findByDescriptionContaining(String description);
    public List<Item> findByTopicDescriptionContaining(String description);
    public List<Item> findByTopicId(Long id);
    public List<Item> findByCollectionDescriptionContaining(String description);
    public List<Item> findByCollectionId(Long id);
    public List<Item> findTop20ByOrderByDateDesc();
    public List<Item> findByType(ItemType type);
    public List<Item> findBySourceKindContaining(String source);
    public List<Item> findBySourceKindContainingAndType(String source, ItemType type);
}
