package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Regulations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int coppa;
    private int gdpr;
    private String usPrivacy;

    @ManyToOne
    private ExchangeSpecificExtensions ext;
}
