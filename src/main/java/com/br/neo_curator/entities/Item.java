package com.br.neo_curator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import com.br.neo_curator.entities.enums.ItemType;

import jakarta.persistence.Column;

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

}
