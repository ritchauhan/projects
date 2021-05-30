package com.dev.java.stream.terminalOperation;

import com.dev.java.stream.data.Student;
import com.dev.java.stream.data.StudentDataBase;

import java.util.stream.Collectors;

public class CollectorsJoiningDemo {

    static String joining1() {
        return StudentDataBase.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    static String joining2() {
        return StudentDataBase.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));
    }

    static String joining3() {
        return StudentDataBase.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(",", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());
    }
}
