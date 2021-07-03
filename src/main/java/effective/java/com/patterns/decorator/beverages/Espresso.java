package effective.java.com.patterns.decorator.beverages;

import effective.java.com.patterns.decorator.decorators.Beverage;

public class Espresso extends Beverage {

    public final static int COST = 1;

    @Override
    public int cost() {
        return COST;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
