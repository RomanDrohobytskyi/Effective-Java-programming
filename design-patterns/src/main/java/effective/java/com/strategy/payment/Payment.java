package effective.java.com.strategy.payment;

import java.math.BigDecimal;

public interface Payment {

    void pay(BigDecimal price);

}
