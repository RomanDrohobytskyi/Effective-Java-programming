package head.first.examples.strategy;

import effective.java.com.head.first.examples.adapter.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AdapterTest {

    private static Duck adaptedTurkey;
    private static Turkey adaptedDuck;

    @BeforeAll
    static void initAdapters() {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        adaptedDuck = new DuckAdapter(duck);
        adaptedTurkey = new TurkeyAdapter(turkey);
    }

    @Test
    public void shouldAdaptDuckToTurkey() {
        assertThat(adaptedDuck).isInstanceOf(Turkey.class);
        assertThat(adaptedDuck.gobble()).isEqualTo(MallardDuck.MALLARD_DUCK_QUACK);
        assertThat(adaptedDuck.fly()).isEqualTo(MallardDuck.MALLARD_DUCK_FLY);
    }

    @Test
    public void shouldAdaptTurkeyToDuck() {
        assertThat(adaptedTurkey).isInstanceOf(Duck.class);
        assertThat(adaptedTurkey.quack()).isEqualTo(WildTurkey.WILD_TURKEY_GOBBLE);
        assertThat(adaptedTurkey.fly()).isEqualTo(WildTurkey.WILD_TURKEY_FLY);
    }
}
