package com.dev.java8.optional;

import java.util.Optional;

public class IfIsPresentDemo {

    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable("Hello");
//        Optional<String> str = Optional.ofNullable("null"); // null
        // isPresent
        if (str.isPresent()) {
            System.out.println(str); // Optional[Hello]
        }
        // ifPresent
        str.ifPresent(s -> System.out.println(s)); // Hello
    }
}
