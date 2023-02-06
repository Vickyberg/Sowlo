package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class BrandVersion {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private  Long id;
    private  String brand;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> versions = new HashSet<>();
    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;
}
