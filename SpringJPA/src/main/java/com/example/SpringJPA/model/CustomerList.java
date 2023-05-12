package com.example.SpringJPA.model;

import java.util.List;

public class CustomerList {
    List <Customer> customers;

    public CustomerList() {

    }

    public CustomerList(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getAccounts() {
        return customers;
    }

    public void setAccounts(List<Customer> customers) {
        this.customers = customers;
    }
}
