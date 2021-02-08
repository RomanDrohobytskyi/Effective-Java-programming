package unit.patterns;

import effective.java.com.company.patterns.factorymethod.factory.ComputerFactory;
import effective.java.com.company.patterns.factorymethod.model.Computer;
import effective.java.com.company.patterns.factorymethod.model.ComputerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryMethodTest {

    @Test
    public void shouldCreatePersonalComputer(){
        Computer personalComputer = ComputerFactory.getComputer(ComputerType.PERSONAL_COMPUTER, "32 GB", "1 TB", "2.9 GHz");

        assertTrue(personalComputer.getRAM().equals("32 GB"));
        assertTrue(personalComputer.getHDD().equals("1 TB"));
        assertTrue(personalComputer.getCPU().equals("2.9 GHz"));
    }

    @Test
    public void shouldCreateLaptop(){
        Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16 GB", "500 GB", "2.4 GHz");

        assertTrue(laptop.getRAM().equals("16 GB"));
        assertTrue(laptop.getHDD().equals("500 GB"));
        assertTrue(laptop.getCPU().equals("2.4 GHz"));
    }

    @Test
    public void shouldCreateServer(){
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "64 GB", "5 TB", "2.9 GHz");

        assertTrue(server.getRAM().equals("64 GB"));
        assertTrue(server.getHDD().equals("5 TB"));
        assertTrue(server.getCPU().equals("2.9 GHz"));
    }

    @Test
    public void shouldThrowNullPointerException(){
        assertThrows(NullPointerException.class, () -> ComputerFactory.getComputer(null, "64 GB", "5 TB", "2.9 GHz"));
    }
}
