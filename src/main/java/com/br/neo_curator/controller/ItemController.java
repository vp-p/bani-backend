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

import com.br.neo_curator.entity.Item;
import com.br.neo_curator.service.ItemService;

@RestController
@CrossOrigin
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public List<Item> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{item}")
    public Item findById(@PathVariable ("item") Long id){
        return service.findById(id);
    }

    @PostMapping
    public Item newItem(@RequestBody Item item){
        return service.newItem(item);
    }
}
