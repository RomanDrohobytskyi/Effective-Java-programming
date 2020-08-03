package com.company.oop.nullcheck;

import java.time.LocalDate;

public class LifeTimeWarranty implements Warranty {

    private LocalDate issuedOd;

    public LifeTimeWarranty(LocalDate issuedOn) {
        this.issuedOd = issuedOn;
    }

    @Override
    public Warranty on(LocalDate date) {
        return date.compareTo(this.issuedOd) < 0 ? Warranty.VOID : this;
    }
}
