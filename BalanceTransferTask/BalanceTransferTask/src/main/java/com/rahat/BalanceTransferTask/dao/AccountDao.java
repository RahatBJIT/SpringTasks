package com.rahat.BalanceTransferTask.dao;

import com.rahat.BalanceTransferTask.model.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao {


    @Autowired
    private EntityManager entityManager;

    public AccountDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Transactional
    public void save(Account account) {
        entityManager.persist(account);
    }

    public Account findByAccountId(Long id) {
        return entityManager.find(Account.class, id);
    }

    @Transactional
    public void delete(Account account) {
        Account contact = entityManager.find(Account.class, account.getAccountId());
        entityManager.remove(contact);
    }

    @Transactional
    public void update(Account account) {
        entityManager.merge(account);
    }

    public List<Account> accountList() {
        String jpql = "SELECT c FROM Account c";
        TypedQuery<Account> query = entityManager.createQuery(jpql, Account.class);
        return query.getResultList();
    }

}
