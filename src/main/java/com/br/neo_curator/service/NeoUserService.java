package com.br.neo_curator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.neo_curator.entity.NeoUser;
import com.br.neo_curator.repository.NeoUserRepository;

@Service
public class NeoUserService implements INeoUserService {
    
    @Autowired
    private NeoUserRepository neoUserRepository;

    public NeoUser findById(Long id){
        Optional<NeoUser> neoUserOp = neoUserRepository.findById(id);
        if(neoUserOp.isPresent()){
            return neoUserOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid neoUser id: " + id);
    }

    public NeoUser newNeoUser(NeoUser neoUser){
        if(neoUser == null || neoUser.getUserName() == null || neoUser.getPassword() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Invalid neoUser: " + neoUser);
        }
        return neoUserRepository.save(neoUser);
    }

    public List<NeoUser> findAll(){
        return neoUserRepository.findAll();
    }
}
