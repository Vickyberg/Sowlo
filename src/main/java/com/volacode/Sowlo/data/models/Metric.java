package com.volacode.Sowlo.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Metric {
    String type;
    Float value;
    String vendor;
    ExchangeSpecificExtensions exchangeSpecificExtensions;
}
