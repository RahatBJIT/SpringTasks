package com.example.SpringJPA.dao;

import com.example.SpringJPA.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer , Integer> {

    Customer findByName(String name);

    Customer findByAccountId(Integer id);

    Iterable<Customer> findAll();
}
