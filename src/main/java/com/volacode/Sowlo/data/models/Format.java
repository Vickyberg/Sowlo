package com.volacode.Sowlo.data.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Format {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
}
