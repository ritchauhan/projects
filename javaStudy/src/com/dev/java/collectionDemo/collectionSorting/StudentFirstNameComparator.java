package com.dev.java.collectionDemo.collectionSorting;

import com.dev.java.collectionDemo.basics.Student;

import java.util.Comparator;

public class StudentFirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}
