package effective.java.com.head.first.examples.strategy.model;

import effective.java.com.head.first.examples.strategy.behavior.fly.FlyBehavior;
import effective.java.com.head.first.examples.strategy.behavior.quack.QuackBehavior;
import lombok.Setter;

@Setter
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract String display();

    public String performFly() {
        return this.flyBehavior.fly();
    }

    public String performQuack() {
        return this.quackBehavior.quack();
    }

    public String swim() {
        return "All the ducks float";
    }

}
