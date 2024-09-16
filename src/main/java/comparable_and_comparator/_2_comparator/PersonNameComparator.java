package comparable_and_comparator._2_comparator;

import comparable_and_comparator.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
