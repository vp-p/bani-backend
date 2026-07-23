package com.br.neo_curator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.neo_curator.entity.Topic;
import com.br.neo_curator.service.TopicService;

@RestController
@CrossOrigin
@RequestMapping(value = "topic")
public class TopicController {

    @Autowired
    private TopicService service;

    @GetMapping
    public List<Topic> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{topic}")
    public Topic findById(@PathVariable ("topic") Long id){
        return service.findById(id);
    }

    @PostMapping
    public Topic newTopic(@RequestBody Topic topic){
        return service.newTopic(topic);
    }
}
