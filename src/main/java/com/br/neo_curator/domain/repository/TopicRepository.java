package com.br.neo_curator.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.domain.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    
    public Optional<Topic> findByDescription(String description);
    public List<Topic> findByDescriptionContaining(String description);
    public List<Topic> findTop10ByOrderByWeightDesc();
    
}
