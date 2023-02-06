package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class UserAgent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<BrandVersion> browsers = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    private Set<BrandVersion> platforms = new HashSet<>();

    private String architecture;
    private  String bitness;
    private  String model;
    private  int source;
    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;

}
