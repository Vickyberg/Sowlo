package com.volacode.Sowlo.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Impressions {
    String id;
    List<Metric> metrics = new ArrayList<>();
    Banner banner;
    Video video;
    Audio audio;
    Native aNative;
    PrivateMarketPlace privateMarketPlace;
    String displayManager;
    String displayManagerVer;
    int interstitial;
    String taGid;
    Float bidFloor;
    String bidFloorCurrency;
    int clickBrowser;
    int secure;
    List<String> iFrameBusters = new ArrayList<>();
    int receiveRewards;
    int serverSideAdInsertion;
    int exp;
    ExchangeSpecificExtensions exchangeSpecificExtensions;


}
