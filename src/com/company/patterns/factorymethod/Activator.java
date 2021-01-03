package com.company.patterns.factorymethod;

import com.company.patterns.factorymethod.factory.ComputerFactory;
import com.company.patterns.factorymethod.model.Computer;
import com.company.patterns.factorymethod.model.ComputerType;

public class Activator {

    public static void main(String[] args) {
        Computer personalComputer = ComputerFactory.getComputer(ComputerType.PERSONAL_COMPUTER, "32 GB", "1 TB", "2.9 GHz");
        Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16 GB", "500 TB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "64 GB", "5 TB", "2.9 GHz");

        System.out.println("PERSONAL COMPUTER: \n" + personalComputer);
        System.out.println("LAPTOP: \n" + laptop);
        System.out.println("SERVER: \n" + server);
    }
}
