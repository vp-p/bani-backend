package com.br.neo_curator.domain.service;

import java.util.List;

import com.br.neo_curator.domain.entity.User;

public interface IUserService {
    
    public User findById(String id);
    
    public User newUser(User user);
    
    public List<User> findAll();
}
