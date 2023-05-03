package unit.generics;

import effective.java.com.generics.GenericsMain;
import effective.java.com.generics.comparator.PersonAgeComparator;
import effective.java.com.generics.model.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsMainTest {
    private final static GenericsMain genericsMain = new GenericsMain();;
    private final static List<Person> persons = new ArrayList<>();

    @BeforeAll
    public static void initializePersons() {
        persons.add(new Person("Tom Hanks", 63));
        persons.add(new Person("Leonardo DiCaprio", 45));
        persons.add(new Person("Robert De Niro", 76));
        persons.add(new Person("Brad Pitt", 56));
    }

    @Test
    public void shouldSortByAgeAsc() {
        genericsMain.sortByAgeAsc(persons);

        assertEquals(45, persons.get(0).getAge());
        assertEquals(56, persons.get(1).getAge());
        assertEquals(63, persons.get(2).getAge());
        assertEquals(76, persons.get(3).getAge());
    }

    @Test
    public void shouldSortByAgeAscWithLambda() {
        genericsMain.sortByAgeAscWithLambda(persons);

        assertEquals(45, persons.get(0).getAge());
        assertEquals(56, persons.get(1).getAge());
        assertEquals(63, persons.get(2).getAge());
        assertEquals(76, persons.get(3).getAge());
    }

    @Test
    public void shouldGetYoungestPerson() {
        Person youngestPerson = genericsMain.min(persons, new PersonAgeComparator());

        assertEquals(45, youngestPerson.getAge());
    }
}
