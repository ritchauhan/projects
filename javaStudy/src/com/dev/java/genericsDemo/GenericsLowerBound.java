package com.dev.java.genericsDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBound {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
//        printList(integerList);

        List<String> stringList = new ArrayList<>();
//        printList(stringList); doesn't work since print list only except numbers.
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(50.0);
        doubleList.add(60.0);
//        printList(doubleList);
        List<Number> test = new ArrayList<Number>();
        addToList(test, 11.0);
        addToList(test, 21);
//        addToList(doubleList, 11.5);
        System.out.println(test.get(1));

    }

    static void addToList(List<? super Number> list, Number num) {
        list.add(num);
//        System.out.println(list.get(1));
    }
    static void printList(List<? extends Number> list) {
        list.forEach(System.out::println);
//        list.add(30); // we can't add since its generic type and type safety issue will occur.
    }
}
