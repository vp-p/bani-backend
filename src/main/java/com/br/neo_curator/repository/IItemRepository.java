package com.br.neo_curator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
