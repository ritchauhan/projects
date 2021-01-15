package com.dev.java.collectionDemo.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // add functions
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        // get function
        System.out.println(set.contains("A")); // true
        System.out.println(set.add("A")); // false

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove
        set.remove("A");
        System.out.println(set.contains("A"));
        System.out.println(set.size());
        set.clear();
        System.out.println(set.contains("B"));
        System.out.println(set.size());

    }
}
