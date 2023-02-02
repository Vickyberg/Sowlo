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
public class Video {

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> mimes = new HashSet<>() ;
    private   int minDuration;
    private int maxDuration;
    private int startDelay;
    private int maxSequence;
    private int podDuration;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> protocols = new HashSet<>();
    private int videoPlayerWidth;
    private int videoPlayerHeight;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long podId;
    private   int podSequence;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> rqdDurations = new HashSet<>();
    private int placement;
    private int linearity;
    private   int skip;
    private   int skipMin;
    private   int skipAfter;
    private   int sequence;
    private   int slotInPod;
    private   Float minimumCPMPerSecond;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> blockedCreativeAttributes = new HashSet<>();
    private   int maximumExtendedAdDuration;
    private   int minimumBitRate;
    private   int maximumBitRate;
    private   int boxingAllowed;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> playbackMethods = new HashSet<>();
    private   int playBackend;
    @ElementCollection(fetch = FetchType.EAGER)
    private  Set<Integer> deliveries = new HashSet<>();
    private   int adPosition;

    @OneToMany
    private Set<CompanionAd> companionAds = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> apis = new HashSet<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> companionTypes = new HashSet<>();
    @OneToOne
    public ExchangeSpecificExtensions extensions;






}
