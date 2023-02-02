package com.volacode.Sowlo.data.repositories;

import com.volacode.Sowlo.data.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepo extends JpaRepository<Device, Long> {
}
