package comparable_and_comparator._1_comparable;

import comparable_and_comparator.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting: " + people);
        Collections.sort(people);
        System.out.println("After sorting: " + people);
    }
}
