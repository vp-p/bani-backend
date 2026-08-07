package com.br.bani_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bani_backend.entity.Collections;
import com.br.bani_backend.service.ICollectionsService;

@RestController
@CrossOrigin
@RequestMapping(value = "/collection")
public class CollectionsController {

    @Autowired
    private ICollectionsService service;

    @GetMapping
    public List<Collections> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{collections}")
    public Collections findById(@PathVariable ("collections") Long id){
        return service.findById(id);
    }

    @PostMapping
    public Collections newCollection(@RequestBody Collections collection){
        return service.newCollection(collection);
    }
}
