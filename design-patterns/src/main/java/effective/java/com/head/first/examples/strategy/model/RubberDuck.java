package effective.java.com.head.first.examples.strategy.model;

import effective.java.com.head.first.examples.strategy.behavior.fly.FlyNoWay;
import effective.java.com.head.first.examples.strategy.behavior.quack.Squeak;

public class RubberDuck extends Duck {
    public static final String RUBBER_DUCK = "Rubber Duck";

    public RubberDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Squeak();
    }

    @Override
    public String display() {
        return RUBBER_DUCK;
    }
}
