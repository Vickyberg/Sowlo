package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Producer {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private  int cattegoryTax;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String > categories = new HashSet<>();
    private  String domain;
    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
