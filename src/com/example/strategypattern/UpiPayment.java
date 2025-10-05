package com.example.strategypattern;

public class UpiPayment implements PaymentStrategy{
    private String upiId;

    UpiPayment(String upiId){
        this.upiId=upiId;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid with " + upiId);
    }
}
