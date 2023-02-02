package com.volacode.Sowlo.data.repositories;

import com.volacode.Sowlo.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
