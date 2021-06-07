package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorDemo {

    public static void main(String[] args) {
        System.out.println("By Name....");
        System.out.println(sortStudentByName());
        System.out.println("By Gpa....");
        System.out.println(sortStudentByGpa());
        System.out.println("by gpa desc....");
        System.out.println(sortStudentByGpaDesc());
    }

    static List<Student> students = StudentDataBase.getStudents();
    private static List<Student> sortStudentByName() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    private static List<Student> sortStudentByGpa() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    private static List<Student> sortStudentByGpaDesc() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
}
