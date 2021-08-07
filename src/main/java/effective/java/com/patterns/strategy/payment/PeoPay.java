package effective.java.com.patterns.strategy.payment;

import effective.java.com.generics.model.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class PeoPay implements Payment {
    private User user;

    public PeoPay(User user) {
        this.user = user;
    }

    @Override
    public void pay(BigDecimal price) {
        System.out.println("User e-mail address: " + user.getEmail());
        System.out.println("Paid: " + price);
        System.out.println("Paid by PeoPay payment.");
    }
}
