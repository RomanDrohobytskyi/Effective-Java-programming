package effective.java.com.strategy.payment;

import effective.java.com.strategy.model.PaymentInfo;
import effective.java.com.strategy.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import static effective.java.com.strategy.model.PaymentInfo.successfulPayment;

@Builder
@Getter
@Setter
@RequiredArgsConstructor
public class CardPayment implements Payment {
    private final User user;
    private final String cardNumber;

    @Override
    public PaymentInfo pay(BigDecimal totalPrice) {
        return successfulPayment(totalPrice, this.getClass().getSimpleName());
    }
}
