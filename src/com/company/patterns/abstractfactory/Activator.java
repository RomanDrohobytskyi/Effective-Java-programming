package com.company.patterns.abstractfactory;

import com.company.patterns.abstractfactory.factory.ButtonAndCheckboxMacOSFactory;
import com.company.patterns.abstractfactory.factory.ButtonAndCheckboxWindowsOSFactory;

public class Activator {

    public static void main(String[] args) {
        configureAbstractFactory().clickButtonAndCheckbox();
    }

    private static AbstractFactory configureAbstractFactory() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            return new AbstractFactory(new ButtonAndCheckboxMacOSFactory());
        } else {
            return new AbstractFactory(new ButtonAndCheckboxWindowsOSFactory());
        }
    }
}
