package effective.java.com.oop.nullcheck;

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
        Warranty moneyBack = new TimeLimitedWarranty(sellingDate, Duration.ofDays(60));
        Warranty repair = new TimeLimitedWarranty(sellingDate, Duration.ofDays(365));

        Part sensor = new Part(sellingDate);
        Warranty sensorWarranty = new TimeLimitedWarranty(sellingDate, Duration.ofDays(90));

        Article item1 = new Article(moneyBack, repair);
        item1.install(sensor, sensorWarranty);

        this.claimWarranty(item1);
        this.claimWarranty(item1.withVisibleDamage());
        this.claimWarranty(item1.notOperational().withVisibleDamage());
        this.claimWarranty(item1.notOperational());

        /*Article item2 = new Article(Warranty.VOID, Warranty.lifeTime(sellingDate));
        this.claimWarranty(item2);
        this.claimWarranty(item2.withVisibleDamage().notOperational());
        */

        LocalDate sensorExamined = LocalDate.now().minus(2, ChronoUnit.DAYS);
        this.claimWarranty(item1.sensorNotOperational(sensorExamined));
        this.claimWarranty(item1.notOperational().sensorNotOperational(
                sensorExamined));
    }

    static class Main {
        public static void main(String[] args) {
            new Demo().run();
        }
    }
}
