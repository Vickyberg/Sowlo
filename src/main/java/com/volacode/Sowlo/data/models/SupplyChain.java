package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SupplyChain {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
