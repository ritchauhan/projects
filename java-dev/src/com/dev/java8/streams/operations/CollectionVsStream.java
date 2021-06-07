package com.dev.java8.streams.operations;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {
    public static void main(String[] args) {
        // array list
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        arrayList.remove(2);

        // print the array list
        System.out.println(arrayList);

        // streams can't add and remove element from list
//        arrayList.stream().add(10) // no possible since stream doesn't support this
        Stream<Integer> streamArr = arrayList.stream();
        streamArr.forEach(System.out::println); // we can't iterate it again since this can be done only once.
    }
}
