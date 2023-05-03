package effective.java.com.generics;

import effective.java.com.generics.comparator.PersonAgeComparator;
import effective.java.com.generics.model.Person;

import java.util.Comparator;
import java.util.List;

public class GenericsMain {

    public void sortByAgeAscWithLambda(List<Person> persons){
        persons.sort(Comparator.comparingInt(Person::getAge));
    }

    public void sortByAgeAsc(List<Person> persons){
        persons.sort(new PersonAgeComparator());
    }

    public <T> T min(List<T> values, Comparator<T> comparator){
        if (values.isEmpty()){
            throw new IllegalArgumentException("Empty list");
        }

        T lowestElement = values.get(0);

        for (int i = 1; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, lowestElement) < 0){
                lowestElement = element;
            }
        }
        return lowestElement;
    }
}
