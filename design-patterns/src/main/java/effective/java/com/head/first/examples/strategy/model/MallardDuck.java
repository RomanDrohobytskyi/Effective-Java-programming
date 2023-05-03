package effective.java.com.head.first.examples.strategy.model;

import effective.java.com.head.first.examples.strategy.behavior.fly.FlyWithWings;
import effective.java.com.head.first.examples.strategy.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public static final String MALLARD_DUCK = "Mallard Duck";

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return MALLARD_DUCK;
    }
}
