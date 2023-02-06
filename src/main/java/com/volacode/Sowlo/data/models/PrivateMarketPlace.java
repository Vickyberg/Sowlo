package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class PrivateMarketPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  int privateAuction;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Deal> deals = new HashSet<>();
}
