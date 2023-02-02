package com.volacode.Sowlo.data.repositories;

import com.volacode.Sowlo.data.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video, Long> {
}
