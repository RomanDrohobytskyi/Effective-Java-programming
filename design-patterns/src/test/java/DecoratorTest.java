import effective.java.com.decorator.addons.Caramel;
import effective.java.com.decorator.addons.Milk;
import effective.java.com.decorator.addons.Soy;
import effective.java.com.decorator.beverages.Espresso;
import effective.java.com.decorator.beverages.Latte;
import effective.java.com.decorator.decorators.Beverage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for Decorator Design Pattern")
public class DecoratorTest {

    @Test
    public void shouldBeEspresso() {
        // given
        Espresso espresso = new Espresso();

        // then
        assertThat(espresso.cost()).isEqualTo(Espresso.COST);
        assertThat(espresso.description()).isEqualTo("Espresso");
    }

    @Test
    public void shouldBeEspressoWithMilk() {
        // given
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);

        // when
        int expectedBeverageCost = Espresso.COST + Milk.COST;

        // then
        assertEquals(expectedBeverageCost, beverage.cost());
    }

    @Test
    public void shouldBeLatteWithCaramelAndSoy() {
        // given
        Beverage beverage = new Latte();
        beverage = new Caramel(beverage);
        beverage = new Soy(beverage);

        // when
        int expectedBeverageCost = Latte.COST + Caramel.COST + Soy.COST;

        // then
        assertEquals(expectedBeverageCost, beverage.cost());
    }
}
