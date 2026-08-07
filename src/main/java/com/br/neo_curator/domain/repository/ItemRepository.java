package com.br.neo_curator.domain.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.domain.entity.Item;
import com.br.neo_curator.domain.entity.enums.ItemType;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
    public Optional<Item> findByDescription(String description);
    public List<Item> findByDescriptionContaining(String description);
    public List<Item> findTop20ByOrderByDateDesc();
    public List<Item> findByType(ItemType type);
    public List<Item> findBySourceKindContaining(String source);
    public List<Item> findBySourceKindContainingAndType(String source, ItemType type);
}
