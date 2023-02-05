package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class UID {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public  int agentType;

    @OneToOne(cascade = CascadeType.ALL)
    public  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
