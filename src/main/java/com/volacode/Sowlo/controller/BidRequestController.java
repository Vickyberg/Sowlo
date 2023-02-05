package com.volacode.Sowlo.controller;


import com.volacode.Sowlo.data.models.BidRequest;
import com.volacode.Sowlo.data.repositories.BidRequestRepo;
import com.volacode.Sowlo.data.services.BidRequestService;
import com.volacode.Sowlo.exceptions.BidRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class BidRequestController {


    private final BidRequestService bidRequestService;

    @PostMapping("/create")
    ResponseEntity<?> createBid(@RequestBody BidRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(bidRequestService.createBidRequest(request));
    }

    @GetMapping("/bidRequests")
    public ResponseEntity<List<BidRequest>> getAllBidRequests(){
        return ResponseEntity.ok(bidRequestService.getAlBidRequests());
    }

    @PutMapping("/update/{id}")
    public  ResponseEntity<?> updateById(@PathVariable("id") Long id, @RequestBody BidRequest request){
        try {
            bidRequestService.updateBidRequest(id,request);
            return new ResponseEntity<>(String.format("Bid request with id %s updated successfully", id),HttpStatus.OK);

        }catch (BidRequestException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<?> deleteBidRequestById(@PathVariable("id") Long id){
        try {
            bidRequestService.deleteById(id);
            return new ResponseEntity<>(String.format("Bid Request with id %s successfully deleted",id), HttpStatus.OK);
        }catch (BidRequestException e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
