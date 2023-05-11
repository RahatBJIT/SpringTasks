package com.bit.AutowirefPractice;


public class Trader {
    private String traderName;
    private String city;
    private Bank bank;

    public Trader() {
        System.out.println("No arg constructor called - Trader class");
    }

    public Trader(String traderName, String city, Bank bank) {
        this.traderName = traderName;
        this.city = city;
        this.bank = bank;
        System.out.println("All arg constructor called - Trader class");

    }

    public void getDetails(){
        System.out.println("Trader Name= " + this.traderName);
        System.out.println("City= " + this.city);
        bank.printAccountDetails();
    }
    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
