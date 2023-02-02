package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private Long buyerId;
    private int  yearOfBirth;
    private String gender;
    private String keywords;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> keywordArrays = new HashSet<>();

    @OneToOne
    public  Geo geo;
    @OneToMany
    private Set<Data> data = new HashSet<>();
    @OneToMany
    private  Set<EID> eids = new HashSet<>();
    public String consent;

    @OneToOne
    public ExchangeSpecificExtensions exchangeSpecificExtensions;

}
