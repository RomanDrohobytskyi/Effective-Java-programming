package com.company.oop.nullcheck;

import java.time.LocalDate;
import java.util.Optional;

public class Article {

    private Warranty moneyBackGuarantee;
    private Warranty expressWarranty;
    private Warranty effectiveExpressWarranty;
    private Warranty extendedWarranty;
    private Optional<Part> sensor;

    public Article(Warranty moneyBackGuarantee, Warranty expressWarranty) {
        this(moneyBackGuarantee, expressWarranty, Warranty.VOID, Warranty.VOID, Optional.empty());
     }

    private Article(Warranty moneyBackGuarantee,
                    Warranty expressWarranty,
                    Warranty effectiveExpressWarranty,
                    Warranty extendedWarranty,
                    Optional<Part> sensor) {
        if (expressWarranty == null) throw new IllegalArgumentException();
        if (moneyBackGuarantee == null) throw new IllegalArgumentException();

        this.moneyBackGuarantee = moneyBackGuarantee;
        this.expressWarranty = expressWarranty;
        this.effectiveExpressWarranty = effectiveExpressWarranty;
        this.extendedWarranty = extendedWarranty;
        this.sensor = sensor;
    }

    public Warranty getMoneyBackGuarantee() {
        return moneyBackGuarantee;
    }

    public Warranty getExpressWarranty() {
        return effectiveExpressWarranty;
    }

    public Warranty getExtendedWarranty(){
        return this.sensor.map(part -> part.apply(this.extendedWarranty)).orElse(Warranty.VOID);
    }

    public Article withVisibleDamage(){
        return new Article(Warranty.VOID, this.expressWarranty, this.effectiveExpressWarranty, this.extendedWarranty, this.sensor);
    }

    public Article notOperational(){
        return new Article(this.moneyBackGuarantee, this.expressWarranty, this.expressWarranty, this.extendedWarranty, this.sensor);
    }

    public Article install(Part sensor, Warranty extendedWarranty){
        return new Article(this.moneyBackGuarantee, this.expressWarranty, this.effectiveExpressWarranty, extendedWarranty, Optional.of(sensor));
    }

    public Article sensorNotOperational(LocalDate detectedOn){
        return this.sensor
                .map(part -> part.defective(detectedOn))
                .map(defective -> this.install(defective, this.extendedWarranty))
                .orElse(this);
    }
}
