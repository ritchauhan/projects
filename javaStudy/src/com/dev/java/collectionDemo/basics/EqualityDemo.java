package com.dev.java.collectionDemo.basics;

public class EqualityDemo {

    public static void main(String[] args) {
        // object creation:
        Student student1 = new Student("Ritesh", "Kumar", 1, "IT");
        Student student2 = new Student("Ritesh", "Kumar", 1, "IT");

        // both are false since both are pointing to different object location.
        System.out.println(student1 == student2); // false - both refers to different object.
        System.out.println(student1.equals(student2)); // true - values are same

        //student3 = student1; // true, true - both referenced to same object
        Student student3 = new Student("Ritesh", "Kumar", 1, "IT");
        student3.setRoll(3); // false, false - different obj and values are different
        System.out.println(student1.toString());
        System.out.println(student3.toString());
        // both are true since both are pointing to same memory reference.
        System.out.println(student1 == student3);
        System.out.println(student1.equals(student3));
    }
}
