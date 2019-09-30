package com.company.patterns.strategy.payment;

import java.math.BigDecimal;

public class CardPayment implements Payment {
    private String firstLastNames;
    private String email;
    private String cardNumber;

    public String getFirstLastNames() {
        return firstLastNames;
    }

    public void setFirstLastNames(String firstLastNames) {
        this.firstLastNames = firstLastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardPayment(String firstLastNames, String email, String cardNumber) {
        this.firstLastNames = firstLastNames;
        this.email = email;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(BigDecimal price) {
        System.out.println("User: " + getFirstLastNames() + ", " + getEmail());
        System.out.println("Paid: " + price);
        System.out.println("By card with " + cardNumber + " car number.");
    }
}
