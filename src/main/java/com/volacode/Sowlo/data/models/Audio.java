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
public class Audio {

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> mimes = new HashSet<>() ;
    private   int minDuration;
    private int maxDuration;
    private  int startDelay;

    private int podDuration;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> protocols = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String podId;
    private  int podSequence;
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> rqdDurations = new HashSet<>();
    private int sequence;
    private  int slotInPod;
    private  Float minimumCPMPerSecond;

    @ElementCollection(fetch = FetchType.EAGER)
    private  Set<Integer> blockedCreativeAttributes = new HashSet<>();
    private  int maximumExtendedAdDuration;
    private  int minimumBitRate;
    private  int maximumBitRate;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> deliveries = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<CompanionAd> companionAds = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Integer> apis = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private  Set<Integer> companionTypes = new HashSet<>();
    private int maxSequence;
    private  int feed;
    private int stitched;
    private int normalizedVolume;

    @OneToOne(cascade = CascadeType.ALL)
    private ExchangeSpecificExtensions extensions;

}
