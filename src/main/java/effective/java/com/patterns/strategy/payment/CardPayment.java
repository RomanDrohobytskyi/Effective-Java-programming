package effective.java.com.patterns.strategy.payment;

import effective.java.com.generics.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
public class CardPayment implements Payment {
    private final User user;
    private final String cardNumber;

    @Override
    public void pay(BigDecimal price) {
        System.out.println("User: " + user.getEmail());
        System.out.println("Paid: " + price + " USD");
        System.out.println("By card with " + cardNumber + " card number.");
    }
}
