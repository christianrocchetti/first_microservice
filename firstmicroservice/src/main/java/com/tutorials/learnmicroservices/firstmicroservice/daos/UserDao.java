package com.tutorials.learnmicroservices.firstmicroservice.daos;

import com.tutorials.learnmicroservices.firstmicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, String>{
    //custom
    // Spring capirà che dovrà cercare un "id" di uno User
    // (User è stato inserito in "JpaRepository<User, String>")
    Optional<User> findById(String id);
}
