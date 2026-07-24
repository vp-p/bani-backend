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

import com.br.neo_curator.entity.NeoUser;
import com.br.neo_curator.service.INeoUserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/neo-user")
public class NeoUserController {

    @Autowired
    private INeoUserService service;

    @GetMapping
    public List<NeoUser> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{neoUser}")
    public NeoUser findById(@PathVariable ("neoUser") Long id){
        return service.findById(id);
    }

    @PostMapping
    public NeoUser newNeoUser(@RequestBody NeoUser neoUser){
        return service.newNeoUser(neoUser);
    }
}
