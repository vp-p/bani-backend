package com.br.neo_curator.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.br.neo_curator.domain.entity.Item;
import com.br.neo_curator.domain.repository.ItemRepository;

@Service
public class ItemService implements IItemService {
    
    @Autowired
    private ItemRepository itemRepository;

    public Item findById(Long id){
        Optional<Item> itemOp = itemRepository.findById(id);
        if(itemOp.isPresent()){
            return itemOp.get();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid item id: " + id);
    }

    public Item newItem(Item item){
        if(item == null
            || item.getTitle() == null
            || item.getDescription() == null
            || item.getType() == null
            || item.getDate() == null
            || item.getSource() == null
            || item.getSourceKind() == null
            || item.getTopics().isEmpty()
            ){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
                "Invalid item: " + item);
        }
        return itemRepository.save(item);
    }

    public List<Item> findAll(){
        return itemRepository.findAll();
    }
}
