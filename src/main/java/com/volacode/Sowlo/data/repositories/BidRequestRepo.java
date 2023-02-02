package com.volacode.Sowlo.data.repositories;

import com.volacode.Sowlo.data.models.BidRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BidRequestRepo extends JpaRepository<BidRequest, Long> {

    Optional<BidRequest> findBidRequestsById(Long id);
}
