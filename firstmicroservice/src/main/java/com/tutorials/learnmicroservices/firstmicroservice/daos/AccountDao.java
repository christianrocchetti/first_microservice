package com.tutorials.learnmicroservices.firstmicroservice.daos;

import com.tutorials.learnmicroservices.firstmicroservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, String>{
    // Navite Querys
    @Query(value = "SELECT * FROM accounts WHERE FK_USER=:user", nativeQuery = true)
    List<Account> getAllAccountsPerUser(@Param("user") String user);
    // Spring autoimplementa la query SELECT * FROM accoutns WHERE accoutns.fkUser=:fkUSer
    List<Account> findByFkUser(String fkUser);
}
