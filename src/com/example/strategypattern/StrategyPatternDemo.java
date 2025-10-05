package com.example.strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.pay(1000);

        paymentContext.setPaymentStrategy(new PaypalPayment("mansibora11@gmail.com"));
        paymentContext.pay(2000);

        paymentContext.setPaymentStrategy(new UpiPayment("user@upi"));
        paymentContext.pay(3000);
    }
}
