package com.br.neo_curator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
