package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class CountingDemo {

    static long counting() {
       return StudentDataBase.getStudents()
                .stream()
//                .map(Student::getName)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(counting());
    }
}
