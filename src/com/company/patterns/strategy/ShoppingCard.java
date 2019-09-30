package com.company.patterns.strategy;

import com.company.patterns.strategy.Item;
import com.company.patterns.strategy.payment.Payment;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCard {

    private List<Item> items;
    private BigDecimal itemsAmount;

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

    /**
     * Getting amount of all items in shopping card
     * @return amount
     */
    public BigDecimal getUserShopingCarAmount(){

        itemsAmount = new BigDecimal(0);

        if (items != null && items.size() > 0){
            for (Item item : items){
                itemsAmount = itemsAmount.add(item.getPrice());
            }
        }
        return itemsAmount;
    }

    public void pay(Payment payment, BigDecimal itemsAmount){
        payment.pay(itemsAmount);
    }

}
