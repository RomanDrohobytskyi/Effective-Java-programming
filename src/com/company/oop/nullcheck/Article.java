package com.company.oop.nullcheck;

public class Article {

    private Warranty moneyBackGuarantee;
    private Warranty expressWarranty;

    public Warranty getMoneyBackGuarantee() {
        return moneyBackGuarantee;
    }

    public Warranty getExpressWarranty() {
        return expressWarranty;
    }

    public Article(Warranty moneyBackGuarantee, Warranty expressWarranty) {
        this.moneyBackGuarantee = moneyBackGuarantee;
        this.expressWarranty = expressWarranty;
    }
}
