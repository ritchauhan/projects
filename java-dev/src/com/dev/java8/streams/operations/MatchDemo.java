package com.dev.java8.streams.operations;

import com.dev.java8.data.StudentDataBase;

public class MatchDemo {

    static boolean allMatch() {
        // all student should match the criteria then true or false
        return StudentDataBase.getStudents().stream()
                .allMatch(student -> student.getGpa() > 4.0);
    }

    static boolean anyMatch() {
        // any student should match the criteria then true or false
        return StudentDataBase.getStudents().stream()
                .anyMatch(student -> student.getGpa() > 4.0);
    }

    static boolean noneMatch() {
        // reverse of all match. none of the criteria matches then true or false
        return StudentDataBase.getStudents().stream()
                .noneMatch(student -> student.getGpa() > 5.5);
    }
    public static void main(String[] args) {
        System.out.println(allMatch()); // false
        System.out.println(anyMatch()); // true
        System.out.println(noneMatch()); // true
    }
}
