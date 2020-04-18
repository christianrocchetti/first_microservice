package com.tutorials.learnmicroservices.firstmicroservice.services;

import com.tutorials.learnmicroservices.firstmicroservice.daos.AccountDao;
import com.tutorials.learnmicroservices.firstmicroservice.daos.OperationDao;
import com.tutorials.learnmicroservices.firstmicroservice.entities.Account;
import com.tutorials.learnmicroservices.firstmicroservice.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service @Transactional
public class OperationServiceImpl implements OperationService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    OperationDao operationDao;


    @Override
    public List<Operation> getAllOperationPerAccount(String accountId){
        return operationDao.findAllOperationsByAccount(accountId);
    }

    @Override
    public List<Account> getAllAccountsPerUser(String userId){
        return accountDao.getAllAccountsPerUser(userId);
    }

    @Override
    public Operation saveOperation(Operation operation){

        if(operation.getDate() == null){
            operation.setDate(new Date());
        }

        return operationDao.save(operation);
    }



}
