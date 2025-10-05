package com.example.strategypattern;

public class PaypalPayment implements PaymentStrategy{
    private String email;

    PaypalPayment(String email){
        this.email=email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid with " + email);
    }
}
