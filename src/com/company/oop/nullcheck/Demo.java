package com.company.oop.nullcheck;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Demo {

    public void claimWarranty(Article article){
        LocalDate today = LocalDate.now();

        article.getMoneyBackGuarantee().on(today).claim(this::offerMoneyBack);
        article.getExpressWarranty().on(today).claim(this::offerRepair);
        System.out.println("----------------------");
    }

    private void offerMoneyBack(){
        System.out.println("Offer money back.");
    }

    private void offerRepair(){
        System.out.println("Offer repair.");
    }

    public void run() {
        LocalDate sellingDate =  LocalDate.now().minus(40, ChronoUnit.DAYS);
        Warranty moneyBack = new TimeLimitedWarranty(sellingDate, Duration.ofDays(30));
        Warranty repair = new TimeLimitedWarranty(sellingDate, Duration.ofDays(365));
        Article item1 = new Article(moneyBack, repair);
        Article item2 = new Article(Warranty.VOID, Warranty.lifeTime(sellingDate));

        this.claimWarranty(item1);
        this.claimWarranty(item2);
    }

    static class Main {
        public static void main(String[] args) {
            new Demo().run();
        }
    }
}
