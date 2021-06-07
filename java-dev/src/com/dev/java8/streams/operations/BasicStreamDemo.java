package com.dev.java8.streams.operations;

import com.dev.java8.javabrains.lambda.exercise1.Person;

import java.util.Arrays;
import java.util.List;

public class BasicStreamDemo {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ritesh", "Kumar", 30),
                new Person("Aditya", "Sharma", 28),
                new Person("Avishek", "Dey", 31),
                new Person("Amit", "Kumar", 36)
        );

        personList.stream()
                .filter(person -> person.getLname().startsWith("K"))
                .peek(person -> System.out.println("After first filter: " + person )) // used for debugging
                .filter(person -> person.getFname().startsWith("R"))
                .peek(person -> System.out.println("After second filter: " + person ))
                .forEach(person -> System.out.println(person));
        long count = personList.parallelStream()
                .filter(person -> person.getFname().startsWith("A"))
                .count();
        System.out.println(count);
    }
}
