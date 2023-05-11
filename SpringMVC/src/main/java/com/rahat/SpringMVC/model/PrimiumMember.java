package com.rahat.SpringMVC.model;

public class PrimiumMember extends  Member {

    private String discountPercentage;
    public PrimiumMember() {
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }



    public PrimiumMember(Integer id, String name, Integer age, String discountPercentage) {
        super(id, name, age);
        this.discountPercentage = discountPercentage;
    }

    public void getBonus(){

        System.out.println("This is your bonus");
    }

//    @Override
//    public String toString() {
//        return "PrimiumMember{}";
//    }
}
