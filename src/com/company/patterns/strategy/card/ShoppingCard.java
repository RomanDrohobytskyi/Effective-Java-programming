package com.company.patterns.strategy.card;

import com.company.patterns.strategy.item.Item;
import com.company.patterns.strategy.payment.Payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    private List<Item> items = new ArrayList<>();
    private BigDecimal itemsAmount = BigDecimal.ZERO;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public BigDecimal getItemsAmount() {
        return itemsAmount;
    }

    public void setItemsAmount(BigDecimal itemsAmount) {
        this.itemsAmount = itemsAmount;
    }

    public ShoppingCard(){}

    public ShoppingCard(List<Item> items) {
        this.items = items;
    }

    /**
     * Getting amount of all items in shopping card
     * @return amount
     */
    public BigDecimal getUserShoppingCarAmount(){
        itemsAmount = items.stream()
                .map(Item::getPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        return itemsAmount;
    }

    public void pay(Payment payment, BigDecimal itemsAmount){
        payment.pay(itemsAmount);
    }

}
