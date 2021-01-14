package com.dev.java.collectionDemo.arrayListDemo;

import java.util.List;
import java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        // add and set
        list.add("Element 1");
        list.add(0, "Element 0");
        list.set(0, "Element 0 replaced");

        // remove
//        list.remove("Element 0");
//        list.removeAll(list);
        list.remove(0);

        // get
//        System.out.println(list.get(0));
        System.out.println(list);

    }
}
