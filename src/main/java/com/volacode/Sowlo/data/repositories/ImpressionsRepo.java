package com.volacode.Sowlo.data.repositories;

import com.volacode.Sowlo.data.models.Impressions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImpressionsRepo extends JpaRepository<Impressions,Long> {
}
