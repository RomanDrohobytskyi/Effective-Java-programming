package head.first.examples.strategy;

import effective.java.com.head.first.examples.strategy.model.DecoyDuck;
import effective.java.com.head.first.examples.strategy.model.Duck;
import effective.java.com.head.first.examples.strategy.model.MallardDuck;
import effective.java.com.head.first.examples.strategy.model.RubberDuck;
import org.junit.jupiter.api.Test;

import static effective.java.com.head.first.examples.strategy.behavior.fly.FlyNoWay.FLY_NO_WAY;
import static effective.java.com.head.first.examples.strategy.behavior.fly.FlyWithWings.FLY_WITH_WINGS;
import static effective.java.com.head.first.examples.strategy.behavior.quack.MuteQuack.MUTE_QUACK;
import static effective.java.com.head.first.examples.strategy.behavior.quack.Quack.QUACK;
import static effective.java.com.head.first.examples.strategy.behavior.quack.Squeak.SQUEAK;
import static effective.java.com.head.first.examples.strategy.model.DecoyDuck.DECOY_DUCK;
import static effective.java.com.head.first.examples.strategy.model.MallardDuck.MALLARD_DUCK;
import static effective.java.com.head.first.examples.strategy.model.RubberDuck.RUBBER_DUCK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyPatternTest {
    Duck mallardDuck = new MallardDuck();
    Duck rubberDuck = new RubberDuck();
    Duck decoyDuck = new DecoyDuck();

    @Test
    void shouldBeMallardDuck() {
        assertEquals(MALLARD_DUCK, mallardDuck.display());
        assertEquals(FLY_WITH_WINGS, mallardDuck.performFly());
        assertEquals(QUACK, mallardDuck.performQuack());
    }

    @Test
    void shouldBeRubberDuck() {
        assertEquals(RUBBER_DUCK, rubberDuck.display());
        assertEquals(FLY_NO_WAY, rubberDuck.performFly());
        assertEquals(SQUEAK, rubberDuck.performQuack());
    }

    @Test
    void shouldBeDecoyDuck() {
        assertEquals(DECOY_DUCK, decoyDuck.display());
        assertEquals(FLY_NO_WAY, decoyDuck.performFly());
        assertEquals(MUTE_QUACK, decoyDuck.performQuack());
    }
}
