package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class SumAvgDemo {

    public static void main(String[] args) {
        // sum
       int grades = StudentDataBase.getStudents()
                    .stream()
                .collect(Collectors.summingInt(Student::getGradeLevel));
        System.out.println(grades);

        // average
        double gpas = StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.averagingDouble(Student::getGpa));
        System.out.println(gpas);


    }
}
