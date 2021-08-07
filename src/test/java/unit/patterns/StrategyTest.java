package unit.patterns;

import effective.java.com.generics.model.User;
import effective.java.com.patterns.strategy.card.ShoppingCard;
import effective.java.com.patterns.strategy.item.Item;
import effective.java.com.patterns.strategy.payment.CardPayment;
import effective.java.com.patterns.strategy.payment.Payment;
import effective.java.com.patterns.strategy.payment.PeoPay;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyTest {
    private final List<Item> waterAndNutsItems = waterAndNutsItems();
    private final List<Item> waterAndNutsAndMilkItems = waterAndNutsAndMilkItems();

    private List<Item> waterAndNutsAndMilkItems() {
        Item water = new Item("Borjomi", "Water", BigDecimal.valueOf(3));
        Item nuts = new Item("Tasty nuts", "Nuts", BigDecimal.valueOf(15));
        Item milk = new Item("Cow milk", "Cow milk", new BigDecimal("4.5"));
        return new ArrayList<>(Arrays.asList(water, nuts, milk));
    }

    private List<Item> waterAndNutsItems() {
        Item water = new Item("Borjomi", "Water", BigDecimal.valueOf(3));
        Item nuts = new Item("Tasty nuts", "Nuts", BigDecimal.valueOf(15));
        return new ArrayList<>(Arrays.asList(water, nuts));
    }

    @Test
    public void shouldPayByPeoPay(){
        ShoppingCard shoppingCard = new ShoppingCard(waterAndNutsItems);
        BigDecimal amount = shoppingCard.getUserShoppingCarAmount();
        User user =  new User("John", "Noah@gmail.com", shoppingCard);
        Payment peoPayPayment = new PeoPay(user);

        user.getShoppingCard().pay(peoPayPayment, amount);
    }

    @Test
    public void shouldPayByCard(){
        ShoppingCard shoppingCard = new ShoppingCard(waterAndNutsAndMilkItems);
        BigDecimal amount = shoppingCard.getUserShoppingCarAmount();
        User user =  new User("Bradley", "Adil@gmail.com", shoppingCard);
        Payment cardPayment = new CardPayment(user, "24442455523423");

        user.getShoppingCard().pay(cardPayment, amount);
    }
}
