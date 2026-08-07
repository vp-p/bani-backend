package com.br.bani_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.bani_backend.entity.Collections;
import com.br.bani_backend.repository.CollectionsRepository;

@Service
public class CollectionsService implements ICollectionsService {
    
    @Autowired
    private CollectionsRepository collectionRepository;

    public Collections findById(Long id){
        Optional<Collections> collectionOp = collectionRepository.findById(id);
        if(collectionOp.isPresent()){
            return collectionOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid collection id: " + id);
    }

    public Collections newCollection(Collections collection){
        if(collection == null || collection.getDescription() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Invalid collection: " + collection);
        }
        return collectionRepository.save(collection);
    }

    public List<Collections> findAll(){
        return collectionRepository.findAll();
    }
}
