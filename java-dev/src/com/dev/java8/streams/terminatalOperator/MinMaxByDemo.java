package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxByDemo {

    public static void main(String[] args) {
        // minBy
        Optional<Student> student = StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGradeLevel)));
        System.out.println(student);

        // maxBy
        Optional<Student> student1 = StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGradeLevel)));
        System.out.println(student1);
    }
}
