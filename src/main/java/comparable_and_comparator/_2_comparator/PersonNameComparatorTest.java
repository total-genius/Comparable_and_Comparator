package comparable_and_comparator._2_comparator;

import comparable_and_comparator.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonNameComparatorTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Charlie", 35));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));


        // Сортировка по имени
        System.out.println("До сортировки: "+ people);
        Collections.sort(people, new PersonNameComparator());
        System.out.println("Сортировка по имени: " + people);
    }
}
