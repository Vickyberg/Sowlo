package com.volacode.Sowlo.services;

import com.volacode.Sowlo.data.models.BidRequest;
import com.volacode.Sowlo.exceptions.BidRequestException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BidRequestService {

    String createBidRequest(BidRequest request)throws BidRequestException;

    List<BidRequest> getAlBidRequests();

    void updateBidRequest(Long id,BidRequest request);

    void deleteById(Long id);


}
