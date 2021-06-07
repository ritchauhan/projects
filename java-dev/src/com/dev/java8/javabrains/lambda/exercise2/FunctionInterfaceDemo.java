package com.dev.java8.javabrains.lambda.exercise2;

import com.dev.java8.javabrains.lambda.exercise1.Condition;
import com.dev.java8.javabrains.lambda.exercise1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ritesh", "Kumar", 30),
                new Person("Aditya", "Sharma", 28),
                new Person("Avishek", "Dey", 31),
                new Person("Amit", "Kumar", 36)
        );

        // sort by last name
        System.out.println("person sorting");
        Collections.sort(personList, (person, person2) -> person.getLname().compareTo(person2.getLname()));

        // person with first name start with A
        System.out.println("Printing person which first name starts with A");
        printWithCondition(personList, person -> person.getFname().charAt(0) == 'A', p -> System.out.println(p.getFname()) );

        // person with last name start with K
        System.out.println("Printing person which last name starts with K");
        printWithCondition(personList, person -> person.getLname().startsWith("K"), p -> System.out.println(p) );

        // another way to print full list
        System.out.println("print full list with condition true");
        printWithCondition(personList, person -> true, p -> System.out.println(p));

    }

    private static void printWithCondition(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : persons)
            if (predicate.test(person))
                consumer.accept(person);
    }
}
