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

    @OneToMany
    private Set<Metric> metrics = new HashSet<>();

    @OneToOne
    private Banner banner;
    @OneToOne
    private Video video;
    @OneToOne
    private Audio audio;
    @OneToOne
    private Native aNative;
    @OneToOne
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
    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;


}
