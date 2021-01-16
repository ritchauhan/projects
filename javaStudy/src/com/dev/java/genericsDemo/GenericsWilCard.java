package com.dev.java.genericsDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericsWilCard {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        printList(list);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        printList(integerList);

    }

    static void printList(List<?> list) {
//        list.forEach((element) -> System.out.println(element));
        list.forEach(System.out::println);
//        list.add(30); // we can't add since its generic type and type safety issue will occur.
    }
}
