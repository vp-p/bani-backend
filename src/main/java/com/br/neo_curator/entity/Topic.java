package com.br.neo_curator.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "topic")

public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "top_id")
    private Long id;

    @Column(name = "top_description")
    private String description;

    @Column(name = "top_weight")
    private Short weight = 0;

    @ManyToMany(mappedBy = "topics")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Item> items = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "topic_relationship",
        joinColumns = @JoinColumn(name = "topic_left_id"),
        inverseJoinColumns = @JoinColumn(name = "topic_right_id")
    )
    private Set<Topic> relatedTopics = new HashSet<>();

    public Topic() {
    }

    public Topic(String description, Short weight) {
        this.description = description;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    
}
