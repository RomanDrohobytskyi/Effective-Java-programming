package com.company.patterns.strategy;

import com.company.actor.User;
import com.company.patterns.strategy.payment.CardPayment;
import com.company.patterns.strategy.payment.Payment;
import com.company.patterns.strategy.payment.PeoPay;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrategyActivator {

    public StrategyActivator() {
        activate();
    }

    public void activate(){
        List<Item> items = createItems();
        ShoppingCard shoppingCard = createShoppingCard(items);
        BigDecimal amount = shoppingCard.getUserShoppingCarAmount();

        User RomanDrohobytskyi =  createUser("Roman", "Drohobytskyi", "roma_@gmaik.com", shoppingCard);
        User someOneElse =  createUser("Someone", "Else", "else@gmaiI.com", shoppingCard);

        Payment peoPayPayment = new PeoPay(RomanDrohobytskyi.getFirstname() + " " +
                RomanDrohobytskyi.getLastname(), RomanDrohobytskyi.getEmail());

        Payment cardPayment = new CardPayment(someOneElse.getFirstname() + " " +
                someOneElse.getLastname(), someOneElse.getEmail(),
                "24442455523423");

        RomanDrohobytskyi.getShoppingCard().pay(peoPayPayment, amount);
        System.out.println();
        someOneElse.getShoppingCard().pay(cardPayment, amount);
    }

    private List<Item> createItems() {
        Item water = createItem("Borjomi", "Water", new BigDecimal(3));
        Item nuts = createItem("Tasty nuts", "Nuts", new BigDecimal(15));
        Item milk = createItem("Cow milk", "Cow milk", new BigDecimal(4.5));

        return new ArrayList<>(Arrays.asList(water, nuts, milk));
    }

    private User createUser(String firstName, String lastName, String email, ShoppingCard shoppingCard){
        return new User(firstName, lastName, email, shoppingCard);
    }

    private Item createItem(String name, String description, BigDecimal price){
        return new Item(name, description, price);
    }

    private ShoppingCard  createShoppingCard(List<Item> items){
        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.setItems(items);
        return shoppingCard;
    }

}
