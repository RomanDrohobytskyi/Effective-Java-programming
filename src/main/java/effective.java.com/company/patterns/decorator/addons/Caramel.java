package effective.java.com.company.patterns.decorator.addons;

import effective.java.com.company.patterns.decorator.decorators.AddOnDecorator;
import effective.java.com.company.patterns.decorator.decorators.Beverage;

public class Caramel extends AddOnDecorator {

    public final static int COST = 3;
    private Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + COST;
    }

    @Override
    public String description() {
        return beverage.description() + " With Caramel";
    }
}
