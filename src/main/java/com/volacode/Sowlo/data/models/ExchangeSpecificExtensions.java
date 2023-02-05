package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@Entity
@Data
@NoArgsConstructor
public class ExchangeSpecificExtensions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;

}
