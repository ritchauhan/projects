package com.dev.java.collectionDemo.collectionSorting;

import com.dev.java.collectionDemo.basics.Student;

import java.util.ArrayList;

public class StudentCompare {

    public static void main(String[] args) {
        // object creation:
        Student student1 = new Student("Ritesh2", "Kumar3", 10, "IT");
        Student student2 = new Student("Ritesh1", "Kumars", 5, "IT");
        Student student3 = new Student("Ritesh3", "Chauhan", 1, "IT");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // comparable demo
        students.sort(null);
        System.out.println(students);

        // comparator first name demo
        students.sort(new StudentFirstNameComparator());
        System.out.println(students);

        // comparator last name demo
        students.sort(new StudentLNameComparator());
        System.out.println(students);

    }
}
