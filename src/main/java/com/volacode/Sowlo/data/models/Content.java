package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int episode;
    private  String title;
    private  String series;
    private  String season;
    private String artist;
    private  String genre;
    private  String album;
    private  String isrc;
    @OneToOne
    private Producer producer;
    private  String url;
    private  int CategoryTax;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String > categories = new HashSet<>();
    private  int productionQuality;
    private  int context;
    private  String contentRating;
    private  String userRating;
    private int gagMediaRating;
    private String  keywords;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String > keywordArray = new HashSet<>();
    private  int liveStream;
    private  int sourceRelationship;
    private  int len;
    private  String language;
    private String langB;
    private  int embeddable;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<com.volacode.Sowlo.data.models.Data> data = new HashSet<>();

    @OneToOne
    private Network network;
    @OneToOne
    private Channel channel;

    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
