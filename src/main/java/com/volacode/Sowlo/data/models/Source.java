package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int finalSaleDecision;
    private String transactionId;
    private String paymentId;

    @OneToOne
    private SupplyChain supplyChain;

    @OneToOne
    private ExchangeSpecificExtensions ext;


}
