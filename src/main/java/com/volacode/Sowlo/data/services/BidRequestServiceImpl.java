package com.volacode.Sowlo.data.services;

import com.volacode.Sowlo.data.models.BidRequest;
import com.volacode.Sowlo.data.repositories.BidRequestRepo;
import com.volacode.Sowlo.exceptions.BidRequestException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
@Slf4j
public class BidRequestServiceImpl implements BidRequestService{

    private final BidRequestRepo bidRequestRepo;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public String createBidRequest(BidRequest request)throws BidRequestException  {

//        Optional<BidRequest> foundBidRequest = bidRequestRepo.findById(request.getId());
//        if(foundBidRequest.isPresent()) throw new BidRequestException(
//                String.format("Bid Request With Id %s already exist",request.getId()));
//

        BidRequest bidRequest =modelMapper.map(request, BidRequest.class);
        BidRequest savedRequest =  bidRequestRepo.save(bidRequest);
        log.info("Request to be saved in db :: {}",savedRequest);

        return createdResponse(savedRequest);
    }

    @Override
    public List<BidRequest> getAlBidRequests() {
        return bidRequestRepo.findAll();
    }

    @Override
    public void updateBidRequest(Long id, BidRequest request) {
        Optional<BidRequest> foundBidRequest = bidRequestRepo.findById(id);

        if(foundBidRequest.isPresent()) {
            BidRequest bidRequestToUpdate = foundBidRequest.get();
            updateTheBidRequest(request,bidRequestToUpdate);
            bidRequestRepo.save(bidRequestToUpdate);

        }else {
            throw new BidRequestException("Bid request not found");

        }

    }

    @Override
    public void deleteById(Long id) {
        Optional<BidRequest> foundBidRequest  = bidRequestRepo.findById(id);
        if (foundBidRequest.isPresent()){
            bidRequestRepo.deleteById(id);
        }
    }

    private void updateTheBidRequest(BidRequest request, BidRequest bidRequestToUpdate) {

        bidRequestToUpdate.setLanguages(request.getLanguages());
        bidRequestToUpdate.setCatTax(request.getCatTax());
        bidRequestToUpdate.setAllImpressions(request.getAllImpressions());
        bidRequestToUpdate.setAppUser(request.getAppUser());
        bidRequestToUpdate.setDevice(request.getDevice());

    }




    private String createdResponse(BidRequest savedRequest) {

        return String.format("Bid Request with id %s Created Successfully",savedRequest);
    }
}
