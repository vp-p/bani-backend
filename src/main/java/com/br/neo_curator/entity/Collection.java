package com.br.neo_curator.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "collection")

public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_id")
    private Long id;

    @Column(name = "col_description")
    private String description;

    @ManyToMany(mappedBy = "collections")
    private Set<Item> items = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usr_id")
    private NeoUser neoUser;

    public Collection() {
    }

    public Collection(String description, Set<Item> items, NeoUser neoUser) {
        this.description = description;
        this.items = items;
        this.neoUser = neoUser;
    }

    public Collection(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NeoUser getNeoUser() {
        return neoUser;
    }

    public void setNeoUser(NeoUser neoUser) {
        this.neoUser = neoUser;
    }

    
}
