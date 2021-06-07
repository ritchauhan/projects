package com.dev.java8.javabrains.lambda.exercise1;

import java.util.*;

/**
 * Lambda implementations
 */
public class ExerciseWithLambda {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ritesh", "Kumar", 30),
                new Person("Aditya", "Sharma", 28),
                new Person("Avishek", "Dey", 31),
                new Person("Amit", "Kumar", 36)
        );

//        // sort be last name
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person person, Person t1) {
//                return 0;
//            }
//        });

        // sort by last name
        System.out.println("person sorting");
        Collections.sort(personList, (person, person2) -> person.getLname().compareTo(person2.getLname()));

        // printing sorted person list
        System.out.println("Sorted persons");
//        printPersonsWithLambda(personList);

        // person with first name start with A
        System.out.println("Printing person which first name starts with A");
        printWithCondition(personList, person -> person.getFname().charAt(0) == 'A' );

        // person with last name start with K
        System.out.println("Printing person which last name starts with A");
        printWithCondition(personList, person -> person.getLname().startsWith("K") );

        // another way to print full list
        System.out.println("print full list with condition true");
        printWithCondition(personList, person -> true);

    }

    public static void printPersonsWithLambda(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.getLname());
        }
    }

    private static void printWithCondition(List<Person> persons, Condition<Person> condition) {
        for (Person person : persons)
            if (condition.test(person))
                System.out.println(person);
    }
}
