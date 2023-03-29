package com.example.springsecuritycifrado.Repository;

import com.example.springsecuritycifrado.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
}
