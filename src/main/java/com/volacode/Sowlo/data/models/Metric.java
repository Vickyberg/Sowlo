package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Metric {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String type;
    private Float value;
    private String vendor;
    @OneToOne(cascade = CascadeType.ALL)
    private ExchangeSpecificExtensions exchangeSpecificExtensions;
}
