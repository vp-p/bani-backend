package com.br.neo_curator.domain.service;

import java.util.List;

import com.br.neo_curator.domain.entity.Topic;

public interface ITopicService {
    
    public Topic findById(Long id);
    
    public Topic newTopic(Topic topic);

    public List<Topic> findAll();
}
