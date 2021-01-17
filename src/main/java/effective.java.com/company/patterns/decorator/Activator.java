package effective.java.com.company.patterns.decorator;

import effective.java.com.company.patterns.decorator.addons.Caramel;
import effective.java.com.company.patterns.decorator.addons.Milk;
import effective.java.com.company.patterns.decorator.addons.Soy;
import effective.java.com.company.patterns.decorator.beverages.Espresso;
import effective.java.com.company.patterns.decorator.beverages.Latte;


public class Activator {

    public static void main(String[] args) {
        espresso();
        latteWithCaramelAndSoy();
        espressoWithMilk();
    }

    private static void espresso() {
        Espresso espresso = new Espresso();
        System.out.println(espresso.description() + ", cost: " + espresso.cost());
    }

    private static void espressoWithMilk() {
        Espresso espresso = new Espresso();
        Milk milk = new Milk(espresso);
        System.out.println(espresso.description() + milk.description() + ", cost: " + milk.cost());
    }

    private static void latteWithCaramelAndSoy() {
        Latte latte = new Latte();
        Caramel caramel = new Caramel(latte);
        Soy soy = new Soy(caramel);
        System.out.println(latte.description() + caramel.description() + soy.description() + ", cost: " + soy.cost());
    }
}
