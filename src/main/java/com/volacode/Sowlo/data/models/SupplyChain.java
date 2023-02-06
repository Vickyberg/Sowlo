package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class SupplyChain {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  int complete;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<SupplyChainNode> nodes = new HashSet<>();
    private  String version;
    @OneToOne
  private ExchangeSpecificExtensions exchangeSpecificExtensions;



}
