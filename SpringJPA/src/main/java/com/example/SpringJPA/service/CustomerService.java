package com.example.SpringJPA.service;

import com.example.SpringJPA.dao.CustomerRepository;
import com.example.SpringJPA.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer findByAccountId(int customerId) {
        return customerRepository.findByAccountId(customerId);

    }



    public Customer findByName(String name)
    {
        return customerRepository.findByName(name);
    }

    public Customer saveAccount(Customer customer) {
        return customerRepository.save(customer);
    }
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteAccount(Customer customer) {
        customerRepository.delete(customer);
    }

    public Iterable<Customer> getAllAccounts() {
       return customerRepository.findAll();
    }

}
