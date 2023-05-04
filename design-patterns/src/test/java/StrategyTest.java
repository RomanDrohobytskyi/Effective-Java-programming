import effective.java.com.strategy.card.ShoppingCart;
import effective.java.com.strategy.item.Item;
import effective.java.com.strategy.model.PaymentInfo;
import effective.java.com.strategy.model.User;
import effective.java.com.strategy.payment.CardPayment;
import effective.java.com.strategy.payment.Payment;
import effective.java.com.strategy.payment.PeoPay;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.math.BigDecimal.valueOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyTest {
    private final List<Item> waterAndNutsItems = waterAndNutsItems();
    private final List<Item> waterAndNutsAndMilkItems = waterAndNutsAndMilkItems();

    private List<Item> waterAndNutsAndMilkItems() {
        Item water = new Item("Borjomi", "Water", valueOf(3));
        Item nuts = new Item("Tasty nuts", "Nuts", valueOf(15));
        Item milk = new Item("Cow milk", "Cow milk", valueOf(4.5));
        return new ArrayList<>(Arrays.asList(water, nuts, milk));
    }

    private List<Item> waterAndNutsItems() {
        Item water = new Item("Borjomi", "Water", valueOf(3));
        Item nuts = new Item("Tasty nuts", "Nuts", valueOf(15));
        return new ArrayList<>(Arrays.asList(water, nuts));
    }

    @Test
    public void shouldPayByPeoPay() {
        // given
        ShoppingCart shoppingCard = new ShoppingCart(waterAndNutsItems);
        User user = mockUserWithShoppingCart(shoppingCard);
        Payment peoPayPayment = new PeoPay(user);

        // when
        PaymentInfo paymentInfo = user.getShoppingCart().pay(peoPayPayment);

        //then
        assertTrue(paymentInfo.isSuccessful());
        assertThat(paymentInfo.getTotal()).isEqualTo(valueOf(18));
        assertThat(paymentInfo.getPaymentMethod()).isEqualTo(peoPayPayment.getClass().getSimpleName());
    }

    @Test
    public void shouldPayByCard() {
        // given
        ShoppingCart shoppingCard = new ShoppingCart(waterAndNutsAndMilkItems);
        User user = mockUserWithShoppingCart(shoppingCard);
        Payment cardPayment = new CardPayment(user, "111111111111");

        // when
        PaymentInfo paymentInfo = user.getShoppingCart().pay(cardPayment);

        // then
        assertTrue(paymentInfo.isSuccessful());
        assertThat(paymentInfo.getTotal()).isEqualTo(valueOf(22.5));
        assertThat(paymentInfo.getPaymentMethod()).isEqualTo(cardPayment.getClass().getSimpleName());
    }

    private User mockUserWithShoppingCart(ShoppingCart shoppingCart) {
        return new UserMockBuilder().mockUser().withShoppingCart(shoppingCart).build();
    }

    static class UserMockBuilder {
        private final User user;

        public UserMockBuilder() {
            this.user = User.builder().build();
        }

        public UserMockBuilder mockUser() {
            this.user.setFirstname("Andrew");
            this.user.setLastname("Newton");
            this.user.setEmail("a.newton@gmail.com");
            return this;
        }

        public UserMockBuilder withShoppingCart(ShoppingCart shoppingCart) {
            this.user.setShoppingCart(shoppingCart);
            return this;
        }

        public User build() {
            return this.user;
        }
    }
}
