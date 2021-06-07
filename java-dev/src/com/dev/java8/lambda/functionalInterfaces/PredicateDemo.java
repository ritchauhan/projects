package com.dev.java8.lambda.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
    static Predicate<Integer> p = i -> i%2==0;
    static Predicate<Integer> p1 = i -> i%5==0;
    public static void main(String[] args) {
        // 1st test
        boolean result = p.and(i -> i%5==0).test(10);
//        System.out.println(result); // true
        // 2nd test - and case
        System.out.println(p.and(p1).test(20)); // true
        System.out.println(p.and(p1).test(8)); // false
        // test - or case
        System.out.println(p.or(p1).test(20)); // true // chaining
        System.out.println(p.or(p1).test(8)); // true
        // test - negate case
        System.out.println(p.or(p1).negate().test(20)); // false
        System.out.println(p.or(p1).negate().test(8)); // false
        // test - equal case
    }
}
