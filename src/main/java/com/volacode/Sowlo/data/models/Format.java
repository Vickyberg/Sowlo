package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Format {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  int width;
    private  int height;
    private  int widthRatio;
    private  int heightRatio;
    private int minimumWidth;
    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;
}
