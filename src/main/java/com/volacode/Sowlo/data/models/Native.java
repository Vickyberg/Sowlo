package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Native {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public  String request;
    public String version;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> apis = new HashSet<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> blockedCreativeAttributes = new HashSet<>();
    @OneToOne(cascade = CascadeType.ALL)
    public ExchangeSpecificExtensions exchangeSpecificExtensions;
}
