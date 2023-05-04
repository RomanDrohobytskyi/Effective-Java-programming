package effective.java.com.strategy.payment;

import effective.java.com.strategy.model.PaymentInfo;
import effective.java.com.strategy.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import static effective.java.com.strategy.model.PaymentInfo.successfulPayment;

@Builder
@Getter
@Setter
public class PeoPay implements Payment {
    private User user;

    public PeoPay(User user) {
        this.user = user;
    }

    @Override
    public PaymentInfo pay(BigDecimal totalPrice) {
        return successfulPayment(totalPrice, this.getClass().getSimpleName());
    }
}
