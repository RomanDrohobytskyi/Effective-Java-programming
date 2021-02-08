package effective.java.com.company.patterns.decorator.addons;

import effective.java.com.company.patterns.decorator.decorators.AddOnDecorator;
import effective.java.com.company.patterns.decorator.decorators.Beverage;

public class Milk extends AddOnDecorator {

    public final static int COST = 1;
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + COST;
    }

    @Override
    public String description() {
        return beverage.description() + " With Milk";
    }
}
