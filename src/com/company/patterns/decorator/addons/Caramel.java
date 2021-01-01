package com.company.patterns.decorator.addons;

import com.company.patterns.decorator.decorators.AddOnDecorator;
import com.company.patterns.decorator.decorators.Beverage;

public class Caramel extends AddOnDecorator {

    private final static int CARAMEL_COST = 3;
    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + CARAMEL_COST;
    }

    @Override
    public String description() {
        return " With Caramel";
    }
}
