package com.matheuscordeiro.hruser.repositories;

import com.matheuscordeiro.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

