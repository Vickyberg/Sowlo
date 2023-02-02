package com.volacode.Sowlo.data.services;

import com.volacode.Sowlo.data.models.BidRequest;
import com.volacode.Sowlo.data.repositories.BidRequestRepo;
import com.volacode.Sowlo.exceptions.BidRequestException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class BidRequestServiceImpl implements BidRequestService{

    private final BidRequestRepo bidRequestRepo;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public String createBidRequest(BidRequest request) {

        Optional<BidRequest> foundBidRequest = bidRequestRepo.findById(request.getId());
        if(foundBidRequest.isPresent()) throw new BidRequestException(
                String.format("Bid Request With Id %s already exist",request.getId()));

        BidRequest bidRequest =modelMapper.map(request, BidRequest.class);
        BidRequest savedRequest =  bidRequestRepo.save(bidRequest);

        return creationResponse(savedRequest);
    }

    private String creationResponse(BidRequest savedRequest) {

        return String.format("Bid Request with id %s Created Successfully",savedRequest);
    }
}
