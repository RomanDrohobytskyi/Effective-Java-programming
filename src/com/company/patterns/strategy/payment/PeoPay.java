package com.company.patterns.strategy.payment;

import java.math.BigDecimal;

public class PeoPay implements Payment {

    private String firstLastNames;
    private String email;

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

    public PeoPay(String firstLastNames, String email) {
        this.firstLastNames = firstLastNames;
        this.email = email;
    }

    @Override
    public void pay(BigDecimal price) {
        System.out.println("User: " + getFirstLastNames() + ", " + getEmail());
        System.out.println("Paid: " + price);
        System.out.println("Paid by PeoPay payment.");
    }
}
