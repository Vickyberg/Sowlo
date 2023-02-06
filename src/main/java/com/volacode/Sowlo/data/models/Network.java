package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Network {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private  Long id;
    private  String name ;
    private  String domain;
    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
