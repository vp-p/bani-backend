package com.br.neo_curator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.neo_curator.entity.Topic;
import com.br.neo_curator.repository.ITopicRepository;

@Service
public class TopicService implements ITopicService {
    
    @Autowired
    private ITopicRepository topicRepository;

    public Topic findById(Long id){
        Optional<Topic> topicOp = topicRepository.findById(id);
        if(topicOp.isPresent()){
            return topicOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid topic id: " + id);
    }

    public Topic newTopic(Topic topic){
        if(topic == null || topic.getDescription() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Invalid topic: " + topic);
        }
        return topicRepository.save(topic);
    }

    public List<Topic> findAll(){
        return topicRepository.findAll();
    }
}
