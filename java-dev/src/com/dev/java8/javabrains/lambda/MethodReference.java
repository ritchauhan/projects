package com.dev.java8.javabrains.lambda;

import com.dev.java8.javabrains.lambda.exercise1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Method reference example
 */
public class MethodReference {

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReference::printMessage); // () - > printMessage()
        thread.start();
        List<Person> personList = Arrays.asList(
                new Person("Ritesh", "Kumar", 30),
                new Person("Aditya", "Sharma", 28),
                new Person("Avishek", "Dey", 31),
                new Person("Amit", "Kumar", 36)
        );

        // another way to print full list
        System.out.println("print full list with condition true");
        printWithCondition(personList, person -> true, p -> System.out.println(p));
        printWithCondition(personList, person -> true, System.out::println); // (p) -> System.out.println(p);

    }

    private static void printWithCondition(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : persons)
            if (predicate.test(person))
                consumer.accept(person);
    }

    public static void printMessage() {
        System.out.println("print message");
    }
}
