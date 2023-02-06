package com.volacode.Sowlo.data.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@Data
@Entity
public class Device {
    @Id
    private  Long id;

    @OneToOne
    private Geo geo;

    private  String name;
    private  int doNotTrack;
    private  int limitAdTracking;
    private  String userAgent;
    @OneToOne
    private  UserAgent structuredUserAgent;
    private  String ip;
    private  String ipv6;
    private  int deviceType;
    private  String  make;
    private  String model;
    private String operatingSystem;
    private  String operatingSystemVersion;
    private  String hardwareVersion;
    private int height;
    private int width;
    private  int ppi;
    private Float pxRation;
    private  int js;
    private  int geoFetch;
    private String flashVersion;
    private  String language;
    private  String langB;
    private String carrier;
    private  String mccmnc;
    private  int connectionType;
    private String ifa;
    private  String didsha1;
    private String didmd5;
    private  String dpidsha1;
    private String dpidmd5;
    private String macsha1;
    private String macmd5;
    @OneToOne
    private ExchangeSpecificExtensions exchangeSpecificExtensions;
}
