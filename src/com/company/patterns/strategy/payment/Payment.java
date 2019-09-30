package com.company.patterns.strategy.payment;

import java.math.BigDecimal;

public interface Payment {

    void pay(BigDecimal price);

}
