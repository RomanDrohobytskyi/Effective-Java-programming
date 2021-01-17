package effective.java.com.company.patterns;

import effective.java.com.company.patterns.singleton.Activator;
import effective.java.com.company.patterns.singleton.Connector;
import effective.java.com.company.patterns.strategy.StrategyActivator;
import effective.java.com.company.printer.Printer;

public class PatternsActivator {

    public static void singletonActivator(){

        Printer.printStarsForLength(50);
        System.out.println("This is Eagerly initialized singleton.");
        Activator activator = Activator.getInstance();
        System.out.println(activator.toString());
        Printer.printStarsForLength(50);

        System.out.println("This is Eagerly initialized singleton.");
        Connector connector = Connector.getInstance();
        System.out.println(connector.toString());
        Printer.printStarsForLength(50);
    }

}
