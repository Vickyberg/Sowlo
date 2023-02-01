package com.volacode.Sowlo.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Banner {


    String id;
    List<Format> formats = new ArrayList<>();
    int widthInDeviceIndependentPixels;
    int heightInDeviceIndependentPixels;
    List<Integer> blockedBannerAdTypes = new ArrayList<>();
    List<Integer> blockedCreativeAttributes= new ArrayList<>();
    int position;
    List<String> mimes = new ArrayList<>();
    int topFrame;
    List<Integer> expandableDirections = new ArrayList<>();
    List<Integer> apis = new ArrayList<>();
    int vcm;
    ExchangeSpecificExtensions exchangeSpecificExtensions;



}
