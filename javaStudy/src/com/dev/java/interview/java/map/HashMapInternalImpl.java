package com.dev.java.interview.java.map;

/**
 * function to show internal working of hashmap
 */
public class HashMapInternalImpl {
    public static final int INITIAL_CAPACITY = 16;
    public static int getIndex(int capacity, int hashCode) {
        return hashCode & (capacity-1);
    }
    public static int getHashCode(String s) {
        System.out.println((int)s.charAt(0));
        return s.charAt(0);
    }
    public static void main(String[] args) {
        String str1 = "Ritesh";
        int hashCode = str1.hashCode();
        System.out.println(getIndex(INITIAL_CAPACITY, hashCode));
        System.out.println(getIndex(INITIAL_CAPACITY, new String("Chauhan").hashCode()));
        System.out.println(getIndex(INITIAL_CAPACITY, new String("Kumar").hashCode()));
        System.out.println(getIndex(INITIAL_CAPACITY, new String("Sachin").hashCode()));

        System.out.println(" Another hashcode methods: ");

        // another way to test it
        System.out.println(getIndex(INITIAL_CAPACITY, getHashCode("Chauhan")));
        System.out.println(getIndex(INITIAL_CAPACITY, getHashCode("Kumar")));
        System.out.println(getIndex(INITIAL_CAPACITY, getHashCode("Sachin")));
    }
}
