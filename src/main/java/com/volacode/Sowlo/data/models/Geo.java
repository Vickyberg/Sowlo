package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Geo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Float latitude;
    private  Float longitude;
    private int type;
    private  int accuracy;
    private  int lastFix;
    private  int ipService;
    private  String country;
    private  String region;
    private  String regionFips104;
    private  String  metro;
    private  String city;
    private  String zip;
    private  int utCoffSet;
    @OneToOne
    private  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
