package unit.collections;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TreeSetsTest {

    @Test
    public void shouldThrowNullPointerException() {
        Set<String> testSet = new TreeSet<>();
        testSet.add("first");
        testSet.add("second");

        assertThrows(NullPointerException.class, () -> testSet.add(null));
    }
}
