package com.dev.java8.javabrains.lambda.exercise1;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        return person.getLname().compareTo(t1.getLname());
    }
}
