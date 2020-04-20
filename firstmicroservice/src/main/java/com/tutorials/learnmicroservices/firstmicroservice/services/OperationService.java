package com.tutorials.learnmicroservices.firstmicroservice.services;

import com.tutorials.learnmicroservices.firstmicroservice.entities.Account;
import com.tutorials.learnmicroservices.firstmicroservice.entities.Operation;

import java.util.List;

public interface OperationService {

    List<Operation> getAllOperationPerAccount(String accountId);
    List<Account> getAllAccountsPerUser(String userId);
    Operation saveOperation(Operation operation);

}