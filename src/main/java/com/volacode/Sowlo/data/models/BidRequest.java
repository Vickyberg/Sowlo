package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class BidRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Impressions> impressions = new HashSet<>();



    @OneToOne(cascade = CascadeType.ALL)
    private Site site;
    @OneToOne(cascade = CascadeType.ALL)
    private App app;

    @OneToOne(cascade = CascadeType.ALL)
    private Device device;

    @OneToOne(cascade = CascadeType.ALL)
    private AppUser appUser;

    private int test;
    private int auctionType;
    private int maximumTime;

    @ElementCollection(fetch = FetchType.EAGER)
     private Set<String> wSeats = new HashSet<>();


    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> bSeats = new HashSet<>();

    private int allImpressions;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> currency = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> languages = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private  Set<String> blockedAdvertiserCategories = new HashSet<>();

    private  int catTax;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> blockedListOfAdvertisers = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
   private Set<String> blockedListOfApplications = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Source source;

    @OneToOne(cascade = CascadeType.ALL)
    private Regulations regulations;

    @OneToOne(cascade = CascadeType.ALL)
    private ExchangeSpecificExtensions exchangeSpecificExtensions;



}
