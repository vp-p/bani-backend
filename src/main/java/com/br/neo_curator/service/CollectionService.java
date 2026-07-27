package com.br.neo_curator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.neo_curator.entity.Collection;
import com.br.neo_curator.repository.ICollectionRepository;

@Service
public class CollectionService implements ICollectionService {
    
    @Autowired
    private ICollectionRepository collectionRepository;

    public Collection findById(Long id){
        Optional<Collection> collectionOp = collectionRepository.findById(id);
        if(collectionOp.isPresent()){
            return collectionOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid collection id: " + id);
    }

    public Collection newCollection(Collection collection){
        if(collection == null || collection.getDescription() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Invalid collection: " + collection);
        }
        return collectionRepository.save(collection);
    }

    public List<Collection> findAll(){
        return collectionRepository.findAll();
    }
}
