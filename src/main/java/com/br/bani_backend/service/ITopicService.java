package com.br.bani_backend.service;

import java.util.List;

import com.br.bani_backend.entity.Topic;

public interface ITopicService {
    
    public Topic findById(Long id);
    
    public Topic newTopic(Topic topic);

    public List<Topic> findAll();
}
