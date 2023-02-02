package com.volacode.Sowlo.data.services;

import com.volacode.Sowlo.data.models.BidRequest;
import org.springframework.stereotype.Service;


public interface BidRequestService {

    String createBidRequest(BidRequest request);
}
