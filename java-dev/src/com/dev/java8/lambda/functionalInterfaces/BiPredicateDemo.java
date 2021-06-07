package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.StudentDataBase;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Double, Integer> bp = (gpa, grade) -> gpa>3.5 && grade>4;

        StudentDataBase.getStudents().forEach(student -> {
            if(bp.test(student.getGpa(), student.getGradeLevel())) {
                System.out.println(student);
            }
        });
    }
}
