package com.br.bani_backend.service;

import java.util.List;

import com.br.bani_backend.entity.User;

public interface IUserService {
    
    public User findById(String id);
    
    public User newUser(User user);
    
    public List<User> findAll();
}
