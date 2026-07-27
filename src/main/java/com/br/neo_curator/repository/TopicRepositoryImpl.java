package com.br.neo_curator.repository;

import java.util.List;
import java.util.Optional;

import com.br.neo_curator.entity.Topic;

public interface TopicRepositoryImpl extends TopicRepository {
    
    public Optional<Topic> findByDescription(String description);
    public List<Topic> findByDescriptionContaining(String description);
    public List<Topic> findTop10ByOrderByWeightDesc();
    
}
