import effective.java.com.singleton.Activator;
import effective.java.com.singleton.Connector;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {

    private static Connector connector;
    private static Activator activator;

    @BeforeAll
    public static void initializeSingletons(){
        connector = Connector.getInstance();
        activator = Activator.getInstance();
    }

    @Test
    public void shouldBeInitialized(){
        assertNotNull(connector);
        assertNotNull(activator);
    }

    @Test
    public void lazilyInitialization(){
        System.out.println(connector.toString());
    }

    @Test
    public void eagerlyInitialization(){
        System.out.println(activator.toString());
    }

    @Test
    public void shouldBeSameInstanceConnector(){
        Connector secondConnector = Connector.getInstance();

        assertSame(secondConnector, connector);
    }

    @Test
    public void shouldBeSameInstanceActivator(){
        Activator secondActivator = Activator.getInstance();

        assertSame(secondActivator, activator);
    }

}
