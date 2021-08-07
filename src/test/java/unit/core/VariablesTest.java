package unit.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VariablesTest {

    @Test
    void shouldBeSameReference() {
        Integer x = 111;
        Integer y = Integer.valueOf("111");

        assertSame(x, y);
    }

    @Test
    void shouldBeDifferentReference() {
        Integer x = 111;
        Integer y = Integer.valueOf("111");
        Integer z = new Integer(111);

        assertNotSame(y, z);
        assertNotSame(x, z);
    }
}
