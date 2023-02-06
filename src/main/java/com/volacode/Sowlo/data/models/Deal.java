package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float bidFloor;
    private String bidFloorCurrency;
    private int auctionType;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> wSeat = new HashSet<>();

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> advertiserDomains = new HashSet<>();

    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;


}
