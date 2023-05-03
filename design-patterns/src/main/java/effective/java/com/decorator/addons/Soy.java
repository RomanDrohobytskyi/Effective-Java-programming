package effective.java.com.decorator.addons;

import effective.java.com.decorator.decorators.AddOnDecorator;
import effective.java.com.decorator.decorators.Beverage;

public class Soy extends AddOnDecorator {

    public final static int COST = 2;
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + COST;
    }

    @Override
    public String description() {
        return beverage.description() + " With Soy";
    }

}
