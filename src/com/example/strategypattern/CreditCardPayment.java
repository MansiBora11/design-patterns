package com.example.strategypattern;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    CreditCardPayment(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid using "+cardNumber);
    }
}
