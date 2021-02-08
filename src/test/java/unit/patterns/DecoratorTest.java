package unit.patterns;

import effective.java.com.company.patterns.decorator.addons.Caramel;
import effective.java.com.company.patterns.decorator.addons.Milk;
import effective.java.com.company.patterns.decorator.addons.Soy;
import effective.java.com.company.patterns.decorator.beverages.Espresso;
import effective.java.com.company.patterns.decorator.beverages.Latte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecoratorTest {

    @Test
    public void shouldBeEspresso(){
        Espresso espresso = new Espresso();

        assertTrue(espresso.cost() == Espresso.COST);
        assertTrue(espresso.description().equals("Espresso"));
        System.out.println(espresso.description());
    }

    @Test
    public void shouldBeEspressoWithMilk(){
        Espresso espresso = new Espresso();
        Milk milk = new Milk(espresso);

        assertTrue(milk.cost() == (Espresso.COST + Milk.COST));
        System.out.println(milk.description());
    }

    @Test
    public void shouldBeLatteWithCaramelAndSoy(){
        Latte latte = new Latte();
        Caramel caramel = new Caramel(latte);
        Soy soy = new Soy(caramel);

        assertTrue(latte.cost() == Latte.COST);
        assertTrue(soy.cost() == (Latte.COST + Caramel.COST + Soy.COST));
        System.out.println(soy.description());
    }
}
