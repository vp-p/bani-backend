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

import com.br.neo_curator.entity.Collection;
import com.br.neo_curator.service.ICollectionService;

@RestController
@CrossOrigin
@RequestMapping(value = "/collection")
public class CollectionController {

    @Autowired
    private ICollectionService service;

    @GetMapping
    public List<Collection> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{collection}")
    public Collection findById(@PathVariable ("collection") Long id){
        return service.findById(id);
    }

    @PostMapping
    public Collection newCollection(@RequestBody Collection collection){
        return service.newCollection(collection);
    }
}
