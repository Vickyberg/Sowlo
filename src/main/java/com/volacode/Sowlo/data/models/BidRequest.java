package com.volacode.Sowlo.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data

@NoArgsConstructor
public class BidRequest {


    private String id;
    private Impressions impression;
    private Site site;
    private App app;
    private Device device;
    private User user;
    private int test;
    private int auctionType;
    private int maximumTime;
    List<String> wSeat = new ArrayList<>();
    List<String> bSeat = new ArrayList<>();
    private int allImpressions;
    List<String> currency = new ArrayList<>();
    List<String> wLangB = new ArrayList<>();
    List<String> blockedAdvertiserCategories = new ArrayList<>();
    private  int catTax;
    List<String> blockListOfAdvertisers = new ArrayList<>();
    List<String> blockListOfApplications = new ArrayList<>();
    private Source source;
    private Regulations regulations;
    private ExchangeSpecificExtensions exchangeSpecificExtensions;



}
