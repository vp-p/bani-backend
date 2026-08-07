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

import com.br.neo_curator.entity.User;
import com.br.neo_curator.service.IUserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{user}")
    public User findById(@PathVariable ("user") String id){
        return service.findById(id);
    }

    @PostMapping
    public User newUser(@RequestBody User user){
        return service.newUser(user);
    }
}
