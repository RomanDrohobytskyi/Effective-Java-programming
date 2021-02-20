package unit.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Variables {

    @Test
    void shouldBeSameReference(){
        Integer x = 111;
        Integer y = Integer.valueOf("111");

        assertTrue(x == y);
    }

    @Test
    void shouldBeDifferentReference(){
        Integer x = 111;
        Integer y = Integer.valueOf("111");
        Integer z = new Integer(111);

        assertTrue(y != z);
        assertTrue(x != z);
    }
}
