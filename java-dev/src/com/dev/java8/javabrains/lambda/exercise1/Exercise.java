package com.dev.java8.javabrains.lambda.exercise1;

import java.util.Arrays;
import java.util.List;

/**
 * test for lambda implementation
 */
public class Exercise {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
            new Person("Ritesh", "Kumar", 30),
            new Person("Aditya", "Sharma", 28),
            new Person("Avishek", "Dey", 31),
            new Person("Amit", "Kumar", 36)
        );

        // sort be last name
        personList.sort(new PersonComparator());

        // creates a method to print all the element from person list
        System.out.println("print sorted person list");
        printPersons(personList);

        // create a method that print all the persons which last name start with K
        System.out.println("Person last name start with K");
        printPersonWithCondition(personList);

        // print with condition
        System.out.println("Person first name start with A");
        printWithCondition(personList, new Condition<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getFname().charAt(0) == 'A';
            }
        });
    }

    public static void printPersons(List<Person> personList) {
        for (Person person: personList) {
            System.out.println(person.getFname() + " " + person.getLname() + " " + person.getAge());
        }
    }

    public static void printPersonWithCondition(List<Person> persons) {
        for (Person person : persons) {
            if (person.getLname().charAt(0) == 'K') {
                System.out.println(person.getFname() + " " + person.getLname() + " " + person.getAge());
            }
        }
    }

    private static void printWithCondition(List<Person> persons, Condition<Person> condition ) {
        for (Person person : persons) {
            if (condition.test(person))
                System.out.println(person);
        }
    }

}
