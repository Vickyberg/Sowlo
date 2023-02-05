package com.volacode.Sowlo.data.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EID {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private   String source;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<UID> uids = new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    public  ExchangeSpecificExtensions exchangeSpecificExtensions;
}
