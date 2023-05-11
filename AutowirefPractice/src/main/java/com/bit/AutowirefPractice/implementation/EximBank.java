package com.bit.AutowirefPractice.implementation;


import com.bit.AutowirefPractice.Bank;

public class EximBank implements Bank {


    private int bankId;
    private int accountId;
    private int balance;






    @Override
    public void printAccountDetails() {
        System.out.println("Bank Id: " + this.bankId);
        System.out.println("Account Id: " + this.accountId);
        System.out.println("Balance: " + this.balance);

    }

    public EximBank() {
        System.out.println("No arg constructor called - EximBank class");
    }
    public EximBank(int bankId, int accountId, int balance) {
        this.bankId = bankId;
        this.accountId = accountId;
        this.balance = balance;
        System.out.println("All arg constructor called - EximBank class");
    }


    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
