package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private int catTax;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> categories = new HashSet<>();
    private String domain;
    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;
}
