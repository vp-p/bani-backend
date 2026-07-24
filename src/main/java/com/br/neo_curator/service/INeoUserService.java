package com.br.neo_curator.service;

import java.util.List;

import com.br.neo_curator.entity.NeoUser;

public interface INeoUserService {
    
    public NeoUser findById(Long id);
    
    public NeoUser newNeoUser(NeoUser neoUser);
    
    public List<NeoUser> findAll();
}
