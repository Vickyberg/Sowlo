package com.volacode.Sowlo.data.repositories;

import com.volacode.Sowlo.data.models.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepo extends JpaRepository<App, Long> {
}
