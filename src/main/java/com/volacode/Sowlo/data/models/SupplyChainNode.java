package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Data
public class SupplyChainNode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  String asi;
    private  String sid;
    private String rid;
    private String name;
    private String domain;
    private  int hp;

    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
