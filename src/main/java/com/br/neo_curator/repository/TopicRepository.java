package com.br.neo_curator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    
}
