package effective.java.com.company.generics;

import effective.java.com.company.generics.actor.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericsMain {

    public void main(){
        List<Person> persons = getPersons();

        System.out.println("List of persons");
        System.out.println(persons);
        System.out.println("Persons after PersonAgeComparator:");
        sortByAgeComparator(persons);
        System.out.println(persons);

        System.out.println("Persons after sort by comparator:");
        persons.clear();
        persons = getPersons();
        sortByAge(persons);
        System.out.println(persons);

        System.out.println("Persons after sort by lambda:");
        persons.clear();
        persons = getPersons();
        sortByLambda(persons);
        System.out.println(persons);

        System.out.println("SortedPair test");
        SortedPair<Integer> pair = new SortedPair<>(1, 2);
        if (pair.getFirst().equals(1) && pair.getSecond().equals(2)){
            System.out.println("True (1, 2): 1 == 1, 2 == 2");
        }

        pair = new SortedPair<>(2, 1);
        if (pair.getFirst().equals(1) && pair.getSecond().equals(2)){
            System.out.println("True (2, 1): 1 == 1, 2 == 2");
        }

        Person youngest = min(persons, new PersonAgeComparator());
        System.out.println("Youngest actor: " + youngest);
    }

    private List<Person> getPersons(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom Hanks", 63));
        persons.add(new Person("Leonardo DiCaprio", 45));
        persons.add(new Person("Robert De Niro", 76));
        persons.add(new Person("Brad Pitt", 56));
        return persons;
    }

    private void sortByAge(List<Person> persons){
        persons.sort(Comparator.comparingInt(Person::getAge));
    }

    private void sortByLambda(List<Person> persons){
        persons.sort(Comparator.comparingInt(Person::getAge));
    }

    private void sortByAgeComparator(List<Person> persons){
        persons.sort(new PersonAgeComparator());
    }

    private <T> T min(List<T> values, Comparator<T> comparator){
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
