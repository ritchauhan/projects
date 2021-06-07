package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.Optional;

public class FindAllAny {

    static Optional<Student> findAny() {
        return StudentDataBase.getStudents().stream()
                .filter(student -> student.getGpa() > 3.8)
                .findAny();
    }

    static Optional<Student> findFirst() {
        return StudentDataBase.getStudents().stream()
                .filter(student -> student.getGpa() > 3.8)
                .findFirst();
    }

    public static void main(String[] args) {
        System.out.println(findAny()); // first match greater than 3.8
        System.out.println(findFirst()); // first match greater than 3.8
    }
}
