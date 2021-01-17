package effective.java.com.company.patterns.decorator.beverages;

import effective.java.com.company.patterns.decorator.decorators.Beverage;

public class Espresso extends Beverage {

    private final static int ESPRESSO_COST = 1;

    @Override
    public int cost() {
        return ESPRESSO_COST;
    }

    @Override
    public String description() {
        return "Espresso";
    }
}
