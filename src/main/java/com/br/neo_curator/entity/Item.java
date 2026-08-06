package com.br.neo_curator.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.br.neo_curator.entity.enums.ItemType;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "item")

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itm_id")
    private Long id;

    @Column(name = "itm_title")
    private String title;

    @Column(name = "itm_description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "itm_type")
    private ItemType type;

    @Column(name = "itm_date")
    private LocalDate date;

    @Column(name = "itm_source")
    private String source;

    @Column(name = "itm_source_kind")
    private String sourceKind;

    @ManyToMany
    @JoinTable(
        name = "item_topic",
        joinColumns = @JoinColumn(name = "itm_id"),
        inverseJoinColumns = @JoinColumn(name = "top_id")
    )
    private Set<Topic> topics = new HashSet<>();

    @ManyToMany
    @JoinTable(
        name = "item_collection",
        joinColumns = @JoinColumn(name = "itm_id"),
        inverseJoinColumns = @JoinColumn(name = "col_id")
    )
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Collections> collections;

    public Item() {
    }

    public Item(String title, String description, ItemType type, LocalDate date, String source, String sourceKind) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.date = date;
        this.source = source;
        this.sourceKind = sourceKind;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceKind() {
        return sourceKind;
    }

    public void setSourceKind(String sourceKind) {
        this.sourceKind = sourceKind;
    }

    public Set<Topic> getTopics() {
        return topics;
    }

    public Set<Collections> getCollections() {
        return collections;
    }

    

}
