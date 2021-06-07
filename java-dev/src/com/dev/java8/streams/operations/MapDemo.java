package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Student> students =  StudentDataBase.getStudents();
        System.out.println(students);

        students.stream()
                .map(student -> student.getName())
                .map(student -> student.toUpperCase())
//                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
