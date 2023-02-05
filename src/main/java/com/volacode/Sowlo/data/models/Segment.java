package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;
    private   String name;
    private   String value;
    @OneToOne(cascade = CascadeType.ALL)
    private ExchangeSpecificExtensions exchangeSpecificExtensions;
}
