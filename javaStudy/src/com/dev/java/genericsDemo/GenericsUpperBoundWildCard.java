package com.dev.java.genericsDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsUpperBoundWildCard {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        printList(integerList);

        List<String> stringList = new ArrayList<>();
//        printList(stringList); doesn't work since print list only except numbers.
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(50.0);
        doubleList.add(60.0);
        printList(doubleList);

    }

    static void printList(List<? extends Number> list) {
        list.forEach(System.out::println);
//        list.add(30); // we can't add since its generic type and type safety issue will occur.
    }
}
