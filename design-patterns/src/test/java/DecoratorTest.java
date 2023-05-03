import effective.java.com.decorator.addons.Caramel;
import effective.java.com.decorator.addons.Milk;
import effective.java.com.decorator.addons.Soy;
import effective.java.com.decorator.beverages.Espresso;
import effective.java.com.decorator.beverages.Latte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void shouldBeEspresso(){
        Espresso espresso = new Espresso();

        assertEquals(Espresso.COST, espresso.cost());
        assertEquals("Espresso", espresso.description());
        System.out.println(espresso.description());
    }

    @Test
    public void shouldBeEspressoWithMilk(){
        Espresso espresso = new Espresso();
        Milk milk = new Milk(espresso);

        assertEquals((Espresso.COST + Milk.COST), milk.cost());
        System.out.println(milk.description());
    }

    @Test
    public void shouldBeLatteWithCaramelAndSoy(){
        Latte latte = new Latte();
        Caramel caramel = new Caramel(latte);
        Soy soy = new Soy(caramel);

        assertEquals(Latte.COST, latte.cost());
        assertEquals((Latte.COST + Caramel.COST + Soy.COST), soy.cost());
        System.out.println(soy.description());
    }
}
