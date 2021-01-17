package effective.java.com.company.patterns.decorator.addons;

import effective.java.com.company.patterns.decorator.decorators.AddOnDecorator;
import effective.java.com.company.patterns.decorator.decorators.Beverage;

public class Soy extends AddOnDecorator {

    private final static int SOY_COST = 2;
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + SOY_COST;
    }

    @Override
    public String description() {
        return " With Soy";
    }

}
