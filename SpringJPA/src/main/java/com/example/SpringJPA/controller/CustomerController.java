package com.example.SpringJPA.controller;

import com.example.SpringJPA.model.Customer;
import com.example.SpringJPA.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/id/{customerId}")
    public Customer detail(@PathVariable int customerId) {
        return customerService.findByAccountId(customerId);
    }

    @PostMapping("/new")
    public Customer newAccount(@RequestBody Customer customer) {
        return customerService.saveAccount(customer);
    }
    @DeleteMapping("/delete/{customerId}")
    void deleteCustomer(@PathVariable Integer customerId) {
        customerService.deleteAccount(detail(customerId));
    }
    @GetMapping("/")
    public Iterable<Customer> allAccount() {
        return customerService.getAllAccounts();
    }
    @PatchMapping("/update")
    public void patchUser(@RequestBody Customer customer) {

    }

    /*  @PutMapping
    String updateAccount(@RequestBody Account account) {
        return accountService.update(account);
    }

  @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Long id) {
        accountRepository.delete(id);
    }

    @GetMapping()
    public List allAccount() {
        return accountRepository.getAllAccounts();
    }

ooooooooo    @PostMapping("/save")
    public String saveAccounts(@RequestBody AccountLIst list) {
        return accountRepository.saveBatch(list.getAccounts());
    }
    */

}
