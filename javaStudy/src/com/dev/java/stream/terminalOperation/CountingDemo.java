package com.dev.java.stream.terminalOperation;

import com.dev.java.stream.data.StudentDataBase;

import java.util.stream.Collectors;

public class CountingDemo {

    static long counting() {
        return StudentDataBase.getStudents()
                .stream()
                .filter(student -> student.getGpa() > 4.0)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println(counting());
    }
}
