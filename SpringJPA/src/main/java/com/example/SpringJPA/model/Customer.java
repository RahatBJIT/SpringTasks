package com.example.SpringJPA.model;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountId;
    private String name;
    private Integer customerAge;

    public Customer() {

    }

    public Customer( String name, Integer customerAge) {

        this.name = name;
        this.customerAge = customerAge;
    }

    public Customer(Integer accountId, String name, Integer customerAge) {

        this.accountId = accountId;

        this.name = name;
        this.customerAge = customerAge;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }
}
