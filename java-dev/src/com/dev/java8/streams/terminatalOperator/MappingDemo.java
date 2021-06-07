package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MappingDemo {
    public static void main(String[] args) {
        List<String> names = StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(names);
        Set<Integer> grades = StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.mapping(Student::getGradeLevel, Collectors.toSet()));
        System.out.println(grades);
    }
}
