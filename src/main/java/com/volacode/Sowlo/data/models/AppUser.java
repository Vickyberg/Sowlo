package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private Long buyerId;
    private int  yearOfBirth;
    private String gender;
    private String keywords;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> keywordArrays = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    public  Geo geo;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Data> data = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    private  Set<EID> eids = new HashSet<>();
    public String consent;

    @OneToOne(cascade = CascadeType.ALL)
    public ExchangeSpecificExtensions exchangeSpecificExtensions;

}
