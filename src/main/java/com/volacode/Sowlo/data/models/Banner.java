package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@Entity
public class    Banner {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @OneToMany
    private Set<Format> formats = new HashSet<>();
    private  int widthInDeviceIndependentPixels;
    private int heightInDeviceIndependentPixels;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> blockedBannerAdTypes = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    Set<Integer> blockedCreativeAttributes= new HashSet<>();
    private int position;

    @ElementCollection(fetch = FetchType.EAGER)
     private Set<String> mimes = new HashSet<>();
    private int topFrame;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> expandableDirections = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> apis = new HashSet<>();
    private int vcm;

    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;



}
