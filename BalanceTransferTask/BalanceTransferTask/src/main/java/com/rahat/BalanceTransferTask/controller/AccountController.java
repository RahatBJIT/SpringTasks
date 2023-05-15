package com.rahat.BalanceTransferTask.controller;


import com.rahat.BalanceTransferTask.model.Account;
import com.rahat.BalanceTransferTask.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;



    @GetMapping("/detail/{accountId}")
    public Account detail(@PathVariable long accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping("/new")
    public void newAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @PutMapping
    void updateAccount(@RequestBody Account account) {
        accountService.update(account);
    }


    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id) {
        accountService.deleteAccount(detail(id));
    }

    @GetMapping()
    public List allAccount() {
        return accountService.getAllAccounts();
    }
    @PutMapping("/{toId}/{amount}/{fromId}")
    void transferBalance(@PathVariable Long toId ,@PathVariable Long amount, @PathVariable Long fromId) {


        accountService.transferBalance(toId , amount, fromId);
    }

}
