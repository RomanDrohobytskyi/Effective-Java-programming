package effective.java.com.patterns.head.first.examples.strategy.model;

import effective.java.com.patterns.head.first.examples.strategy.behavior.fly.FlyNoWay;
import effective.java.com.patterns.head.first.examples.strategy.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public static final String DECOY_DUCK = "Decoy Duck";

    public DecoyDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public String display() {
        return DECOY_DUCK;
    }
}
