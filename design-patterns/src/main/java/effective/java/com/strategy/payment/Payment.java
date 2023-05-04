package effective.java.com.strategy.payment;

import effective.java.com.strategy.model.PaymentInfo;

import java.math.BigDecimal;

public interface Payment {

    PaymentInfo pay(BigDecimal price);
}
