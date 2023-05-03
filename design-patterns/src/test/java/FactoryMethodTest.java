import effective.java.com.factorymethod.factory.ComputerFactory;
import effective.java.com.factorymethod.model.Computer;
import effective.java.com.factorymethod.model.ComputerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactoryMethodTest {

    @Test
    public void shouldCreatePersonalComputer(){
        Computer personalComputer = ComputerFactory.getComputer(ComputerType.PERSONAL_COMPUTER, "32 GB", "1 TB", "2.9 GHz");

        assertEquals("32 GB", personalComputer.getRAM());
        assertEquals("1 TB", personalComputer.getHDD());
        assertEquals("2.9 GHz", personalComputer.getCPU());
    }

    @Test
    public void shouldCreateLaptop(){
        Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16 GB", "500 GB", "2.4 GHz");

        assertEquals("16 GB", laptop.getRAM());
        assertEquals("500 GB", laptop.getHDD());
        assertEquals("2.4 GHz", laptop.getCPU());
    }

    @Test
    public void shouldCreateServer(){
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "64 GB", "5 TB", "2.9 GHz");

        assertEquals("64 GB", server.getRAM());
        assertEquals("5 TB", server.getHDD());
        assertEquals("2.9 GHz", server.getCPU());
    }

    @Test
    public void shouldThrowNullPointerException(){
        assertThrows(NullPointerException.class, () -> ComputerFactory.getComputer(null, "64 GB", "5 TB", "2.9 GHz"));
    }
}
