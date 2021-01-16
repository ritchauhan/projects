package com.dev.java.genericsDemo;

import java.util.ArrayList;
import java.util.List;

/*
    Generics type erasure demo
 */
public class GenericsCheckAtRunTime {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list = addToGenericsList(list, "C");
        System.out.println(list);
        // So when we pass the list which generic will be changed to non generic and will add integer value.
        list = addToRunTimeCheck(list, 10);
        System.out.println(list);
        //String result = list.get(3); // cast exception at runtime but compile time it passed
    }

    static List<String> addToGenericsList(List<String> list, String s) {
        list.add(s);
        return list;
    }

    static List addToRunTimeCheck(List wrongList, Integer a) {
        wrongList.add(a);
        return wrongList;
    }
}
