package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        System.out.println(getFemaleStudents());
    }

    private static List<Student> getFemaleStudents() {
        List<Student> students = StudentDataBase.getStudents();
        return students.stream()
                .filter(student -> student.getGender().equals("Female"))
                .collect(Collectors.toList());
    }
}
