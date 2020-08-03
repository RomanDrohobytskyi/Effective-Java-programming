package com.company.oop.nullcheck;

import java.time.LocalDate;

public interface Warranty {
    Warranty on(LocalDate date);
    default void claim(Runnable action) { action.run(); }

    Warranty VOID = new VoidWarranty();

    static Warranty lifeTime(LocalDate issuedOn) {
        return new LifeTimeWarranty(issuedOn);
    }
}
