package com.dev.java.collectionDemo.iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBasic {

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        for(int i =10; i<20; i++) {
            test.add(i);
        }
        Iterator<Integer> iterator1 = test.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i =0; i<10; i++) {
            arrList.add(i);
        }
        Iterator<Integer> iterator = arrList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
