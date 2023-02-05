package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Impressions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Metric> metrics = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private Banner banner;
    @OneToOne(cascade = CascadeType.ALL)
    private Video video;
    @OneToOne(cascade = CascadeType.ALL)
    private Audio audio;
    @OneToOne(cascade = CascadeType.ALL)
    private Native aNative;
    @OneToOne(cascade = CascadeType.ALL)
    private PrivateMarketPlace privateMarketPlace;
    private String displayManager;
    private String displayManagerVer;
    private  int interstitial;
    private  String taGid;
    private Float bidFloor;
    private String bidFloorCurrency;
    private int clickBrowser;
    private int secure;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> iFrameBusters = new HashSet<>();
    private int receiveRewards;
    private int serverSideAdInsertion;
    private int exp;
    @OneToOne(cascade = CascadeType.ALL)
    private ExchangeSpecificExtensions exchangeSpecificExtensions;


}
