package effective.java.com.strategy.card;

import effective.java.com.strategy.item.Item;
import effective.java.com.strategy.model.PaymentInfo;
import effective.java.com.strategy.payment.Payment;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@NoArgsConstructor
public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
    private BigDecimal total = BigDecimal.ZERO;

    public ShoppingCart(List<Item> items) {
        Objects.requireNonNull(items, "Items could not be null value!");
        this.items = items;
        actualizeTotal();
    }

    public PaymentInfo pay(Payment payment) {
        System.out.println("Paid: " + total + "$");
        System.out.println("Payment method: " + payment.getClass().getSimpleName());
        return payment.pay(this.total);
    }

    public ShoppingCart addItem(Item item) {
        this.items.add(item);
        actualizeTotal();
        return this;
    }

    private BigDecimal actualizeTotal() {
        total = items.stream()
                .map(Item::getPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        return total;
    }

}
