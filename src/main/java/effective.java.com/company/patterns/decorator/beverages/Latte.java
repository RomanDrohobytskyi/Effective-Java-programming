package effective.java.com.company.patterns.decorator.beverages;

import effective.java.com.company.patterns.decorator.decorators.Beverage;

public class Latte extends Beverage {

    private final static int LATTE_COST = 3;

    @Override
    public int cost() {
        return LATTE_COST;
    }

    @Override
    public String description() {
        return "Latte";
    }
}
