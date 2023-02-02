package com.volacode.Sowlo.controller;


import com.volacode.Sowlo.data.models.BidRequest;
import com.volacode.Sowlo.data.repositories.BidRequestRepo;
import com.volacode.Sowlo.data.services.BidRequestService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class BidRequestController {


    private final BidRequestService bidRequestService;

    @PostMapping("/create")
    ResponseEntity<?> createBid(@RequestBody BidRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(bidRequestService.createBidRequest(request));
    }
}
