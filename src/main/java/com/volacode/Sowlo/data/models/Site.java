package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private String domain;
    private  int catTax;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> categories = new HashSet<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private  Set<String> sectionCategories = new HashSet<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> pageCategories = new HashSet<>();
    private String page;
    private String referralURL;
    private String search;
    private int mobile;
    private int privatePolicy;
    @OneToOne
    private Publisher publisher;
    @OneToOne
    private Content content;
    private String keywords;
    @ElementCollection(fetch = FetchType.EAGER)
    private  Set<String> keywordArray = new HashSet<>();
    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;


}
