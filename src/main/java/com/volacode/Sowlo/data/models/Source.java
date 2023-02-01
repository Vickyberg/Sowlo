package com.volacode.Sowlo.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Source {
    private int finalSaleDecision;
    private String transactionId;
    private String paymentId;
    private SupplyChain supplyChain;
    private ExchangeSpecificExtensions ext;


}
