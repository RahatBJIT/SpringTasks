package com.bit.ThemlefPractice.model;

public class Customer {
    private String name;
    private String phoneNumber;
    private String area;

    public Customer(String name, String phoneNumber, String area) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.area = area;
    }

    public Customer() {
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
