package effective.java.com.company.patterns.factorymethod.factory;

import effective.java.com.company.patterns.factorymethod.model.*;

public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {
        switch (type) {
            case PERSONAL_COMPUTER:
                return new PersonalComputer(ram, hdd, cpu);
            case LAPTOP:
                return new Laptop(ram, hdd, cpu);
            case SERVER:
                return new Server(ram, hdd, cpu);
            default:
                throw new IllegalArgumentException("Unknown type of computer: " + type);
        }
    }

}
