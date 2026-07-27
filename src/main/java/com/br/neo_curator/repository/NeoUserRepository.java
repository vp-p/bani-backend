package com.br.neo_curator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.neo_curator.entity.NeoUser;

public interface NeoUserRepository extends JpaRepository<NeoUser, Long> {
    public Optional<NeoUser> findByUserName(String userName);
    public Optional<NeoUser> findByUserNameAndPassword(String userName, String password);
}
