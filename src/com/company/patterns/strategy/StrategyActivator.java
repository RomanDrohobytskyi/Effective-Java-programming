package com.company.patterns.strategy;

import com.company.actor.User;
import com.company.patterns.strategy.payment.CardPayment;
import com.company.patterns.strategy.payment.Payment;
import com.company.patterns.strategy.payment.PeoPay;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StrategyActivator {

    public StrategyActivator() {
        activate();
    }

    public void activate(){

        Item water = createItem("Borjomi", "Water", new BigDecimal(3));
        Item nuts = createItem("Tasty nuts", "Nuts", new BigDecimal(15));
        Item milk = createItem("Cow milk", "Cow milk", new BigDecimal(4.5));

        List<Item> items = new ArrayList<>();

        items.add(water);
        items.add(nuts);
        items.add(milk);

        ShoppingCard shoppingCard = createShoppingCard(items);
        BigDecimal amount = shoppingCard.getUserShopingCarAmount();

        User RomanDrohobytskyi =  createUser("Roman", "Drohobytskyi", "roma_@gmaik.com", shoppingCard);
        User someOneElse =  createUser("Someone", "Else", "else@gmaiI.com", shoppingCard);

        PeoPay peoPay = new PeoPay(RomanDrohobytskyi.getFirstname() + " " +
                RomanDrohobytskyi.getLastname(), RomanDrohobytskyi.getEmail());

        CardPayment cardPayment = new CardPayment(someOneElse.getFirstname() + " " +
                someOneElse.getLastname(), someOneElse.getEmail(),
                "24442455523423");

        RomanDrohobytskyi.getShoppingCard().pay(peoPay, amount);
        System.out.println();
        someOneElse.getShoppingCard().pay(cardPayment, amount);

    }

    private User createUser(String firstname, String lastname, String email, ShoppingCard shoppingCard){
        User user = new User(firstname, lastname, email, shoppingCard);
        return user;
    }

    private Item createItem(String name, String description, BigDecimal price){
        Item item = new Item(name, description, price);
        return item;
    }

    private ShoppingCard  createShoppingCard(List<Item> items){
        ShoppingCard shoppingCard = new ShoppingCard();
        shoppingCard.setItems(items);
        return shoppingCard;
    }



}
