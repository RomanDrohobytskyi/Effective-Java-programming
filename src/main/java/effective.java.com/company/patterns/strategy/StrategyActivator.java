package effective.java.com.company.patterns.strategy;

import effective.java.com.company.generics.actor.User;
import effective.java.com.company.patterns.strategy.card.ShoppingCard;
import effective.java.com.company.patterns.strategy.item.Item;
import effective.java.com.company.patterns.strategy.payment.CardPayment;
import effective.java.com.company.patterns.strategy.payment.Payment;
import effective.java.com.company.patterns.strategy.payment.PeoPay;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrategyActivator {

    static class Activator {
        public static void main(String[] args) {
           new StrategyActivator().activate();
        }
    }

    private void activate() {
        peoPayPaymentTransaction();
        System.out.println();
        cardPaymentTransaction();
    }

    private void peoPayPaymentTransaction(){
        List<Item> waterAndNutsItems = waterAndNutsItems();
        ShoppingCard shoppingCard = new ShoppingCard(waterAndNutsItems);
        BigDecimal amount = shoppingCard.getUserShoppingCarAmount();

        User RomanDrohobytskyi =  new User("John", "Noah", "Noah@gmail.com", shoppingCard);

        Payment peoPayPayment = new PeoPay(RomanDrohobytskyi.getFirstname() + " " +
                RomanDrohobytskyi.getLastname(), RomanDrohobytskyi.getEmail());

        RomanDrohobytskyi.getShoppingCard().pay(peoPayPayment, amount);
    }

    private void cardPaymentTransaction(){
        List<Item> items = waterAndNutsAndMilkItems();
        ShoppingCard shoppingCard = new ShoppingCard(items);
        BigDecimal amount = shoppingCard.getUserShoppingCarAmount();

        User someOneElse =  new User("Bradley", "Adil", "Adil@gmail.com", shoppingCard);

        Payment cardPayment = new CardPayment(someOneElse.getFirstname() + " " +
                someOneElse.getLastname(), someOneElse.getEmail(),
                "24442455523423");

        someOneElse.getShoppingCard().pay(cardPayment, amount);
    }

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
}
