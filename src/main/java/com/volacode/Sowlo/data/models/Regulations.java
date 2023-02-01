package com.volacode.Sowlo.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Regulations {
    int coppa;
    int gdpr;
    String usPrivacy;
    ExchangeSpecificExtensions ext;
}
