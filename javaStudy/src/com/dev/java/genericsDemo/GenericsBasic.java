package com.dev.java.genericsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class GenericsBasic {
    public static void main(String[] args) {
        // Before generics
        ArrayList arrayList = new ArrayList();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(1);
        arrayList.add(new Date());

        String a = (String) arrayList.get(0); // if we don't cast the it will not compile.
        // this will compile but at run time it will throw class cast exception since type is Integer.
        // String c = (String) arrayList.get(2);

        // After generics

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        // this will not allow me to add Integer in String data type. compiler will handle all these kind of problem.
        // arrayList1.add(1);

        System.out.println(arrayList1);

        // Primitive to wrapper conversion

        List<Integer> list = Arrays.asList(10, 20, 30);
        System.out.println(list);

    }
}
