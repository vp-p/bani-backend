package com.br.neo_curator.service;

import java.util.List;

import com.br.neo_curator.entity.User;

public interface IUserService {
    
    public User findById(String id);
    
    public User newUser(User user);
    
    public List<User> findAll();
}
