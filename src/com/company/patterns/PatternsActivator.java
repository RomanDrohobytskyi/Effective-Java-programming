package com.company.patterns;

import com.company.patterns.singleton.Activator;
import com.company.patterns.singleton.Connector;
import com.company.printer.Printer;

public class PatternsActivator {

    public static void singletonActivator(){

        Printer.printStarsForLenght(50);
        System.out.println("This is Eagerly initialized singleton.");
        Activator activator = Activator.getInstance();
        System.out.println(activator.toString());
        Printer.printStarsForLenght(50);

        System.out.println("This is Eagerly initialized singleton.");
        Connector connector = Connector.getInstance();
        System.out.println(connector.toString());
        Printer.printStarsForLenght(50);
    }
}
