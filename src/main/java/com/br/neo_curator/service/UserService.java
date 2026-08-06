package com.br.neo_curator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.neo_curator.entity.User;
import com.br.neo_curator.repository.IUserRepository;

@Service
public class UserService implements IUserService {
    
    @Autowired
    private IUserRepository userRepository;

    public User findById(Long id){
        Optional<User> userOp = userRepository.findById(id);
        if(userOp.isPresent()){
            return userOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid user id: " + id);
    }

    public User newUser(User user){
        if(user == null || user.getUsername() == null || user.getPassword() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Invalid username or password!");
        }
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
