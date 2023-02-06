package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String name;
    private  String bundle;
    private  String domain;
    private  String storeURL;
    private int categoryTax;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String > categories = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String > sectionCategories = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String > pageCategories = new HashSet<>();

    private  String version;
    private  int privacyPolicy;
    private  int paid;

    @OneToOne
    private Publisher publisher;

    @OneToOne
    private Content content;
    private  String keywords;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String >  keywordArray = new HashSet<>();

    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;




}
