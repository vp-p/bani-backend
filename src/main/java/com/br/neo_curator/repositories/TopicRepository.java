package com.br.neo_curator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    
}
