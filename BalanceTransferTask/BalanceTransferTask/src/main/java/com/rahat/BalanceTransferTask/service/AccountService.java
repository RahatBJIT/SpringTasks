package com.rahat.BalanceTransferTask.service;


import com.rahat.BalanceTransferTask.dao.AccountDao;
import com.rahat.BalanceTransferTask.expection.AccountNotFoundException;
import com.rahat.BalanceTransferTask.expection.InsuffientBalanceException;
import com.rahat.BalanceTransferTask.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountDao accountDAO;

    public Account findById(Long id) {
        if (accountDAO.findByAccountId(id)==null){
            throw new AccountNotFoundException("The Account id is invalid.");
        }

        return accountDAO.findByAccountId(id);
    }


    public void saveAccount(Account account) {
        accountDAO.save(account);
    }

    public void update(Account account) {
        accountDAO.update(account);
    }

    public void deleteAccount(Account account) {
        if (account==null){
            throw new AccountNotFoundException("The Account id is invalid.");
        }
        accountDAO.delete(account);

    }

    public List getAllAccounts() {
        return accountDAO.accountList();
    }

    public void transferBalance(Long toId, Long amount, Long fromId) {

        if (accountDAO.findByAccountId(fromId) ==null && accountDAO.findByAccountId(toId) ==null){
            throw new AccountNotFoundException("The Sender and Reciver Account id is invalid");
        } else if (accountDAO.findByAccountId(fromId) ==null) {
            throw new AccountNotFoundException("The Reciever Account id is invalid");
        }else if (accountDAO.findByAccountId(toId) ==null) {
            throw new AccountNotFoundException("The Sender Account id is invalid");
        }

        Long fromCurrentBalance = accountDAO.findByAccountId(fromId).getBalance();

        if (fromCurrentBalance >= amount) {

            Long toBalance = accountDAO.findByAccountId(toId).getBalance() - amount;
            Long fromBalance = accountDAO.findByAccountId(fromId).getBalance() + amount;
            String toFirstName = accountDAO.findByAccountId(toId).getFirstName();
            String toLastName = accountDAO.findByAccountId(toId).getFirstName();
            String fromFirstName = accountDAO.findByAccountId(fromId).getFirstName();
            String fromLastName = accountDAO.findByAccountId(fromId).getFirstName();
            Account toAccount = new Account(toId, toBalance, toFirstName, toLastName);
            Account fromAccount = new Account(fromId, fromBalance, fromFirstName, fromLastName);
            accountDAO.update(toAccount);
            accountDAO.update(fromAccount);

        } else {
            throw new InsuffientBalanceException("Not Enough Balance");

        }


    }

}
