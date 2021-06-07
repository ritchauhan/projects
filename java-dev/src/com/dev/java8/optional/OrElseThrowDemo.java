package com.dev.java8.optional;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.Optional;

public class OrElseThrowDemo {
    // OrElse

    static String orElse() {
             Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudents().get(0));
//             Optional<Student> studentOptional = Optional.ofNullable(null); // Default
             String name = studentOptional.map(Student::getName).orElse("Default");
             return name;
    }

    // OrElseGet
    static String orElseGet() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudents().get(1));
//        Optional<Student> studentOptional = Optional.ofNullable(null); // Default
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    // OrElseThrow
    static String orElseThrow() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudents().get(2));
//        Optional<Student> studentOptional = Optional.ofNullable(null); // Default
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data Available"));
        return name;
    }

    public static void main(String[] args) {
//        System.out.println(orElse());
//        System.out.println(orElseGet());
        System.out.println(orElseThrow());
    }

}
