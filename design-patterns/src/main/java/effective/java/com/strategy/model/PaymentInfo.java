package effective.java.com.strategy.model;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class PaymentInfo {
    private BigDecimal total;
    private String paymentMethod;
    private boolean successful;

    public static PaymentInfo successfulPayment(BigDecimal total, String paymentMethod) {
        return PaymentInfo.builder()
                .total(total)
                .paymentMethod(paymentMethod)
                .successful(true)
                .build();
    }

    public static PaymentInfo unsuccessfulPayment(BigDecimal total, String paymentMethod) {
        return PaymentInfo.builder()
                .total(total)
                .paymentMethod(paymentMethod)
                .successful(false)
                .build();
    }
}
