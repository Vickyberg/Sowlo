package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@lombok.Data
@NoArgsConstructor
@Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Segment> segments = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    public  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
