package unit.collections;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedHashSetsTest {

    @Test
    public void shouldContainOnlyOneNullElement() {
        long expectedNullValuesCount = 1;
        Set<String> testSet = new LinkedHashSet<>();
        testSet.add("first");
        testSet.add("second");
        testSet.add(null);
        testSet.add(null);
        testSet.add(null);

        long nullElementsCount = testSet.stream()
                .filter(Objects::isNull)
                .count();

        assertEquals(expectedNullValuesCount, nullElementsCount);
    }
}
