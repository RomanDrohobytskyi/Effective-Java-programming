package effective.java.com.decorator.beverages;

import effective.java.com.decorator.decorators.Beverage;

public class Latte extends Beverage {

    public final static int COST = 3;

    @Override
    public int cost() {
        return COST;
    }

    @Override
    public String description() {
        return "Latte";
    }
}
