package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class JoiningDemo {

    static String joining() {
        return StudentDataBase.getStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    static String joining1() {
        return StudentDataBase.getStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));
    }

    static String joining2() {
        return StudentDataBase.getStudents()
                .stream()
//                .map(student -> student.getName())
                .map(Student::getName)
                .collect(Collectors.joining(",", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joining());
        System.out.println(joining1());
        System.out.println(joining2());
    }
}
