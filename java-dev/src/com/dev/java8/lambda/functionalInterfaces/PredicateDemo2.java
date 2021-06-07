package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {
    static Predicate<Student> p1 = student -> student.getGpa() > 3.5;
    static Predicate<Student> p2 = student -> student.getGradeLevel() > 4;
    public static void main(String[] args) {
        printGreatGpaStudent();
        System.out.println("......");
        printGreatGradeStudent();
        System.out.println("......");
        printGreatGpaAndGradeStudent();
        System.out.println("......");
        printNegateGreatGpaAndGradeStudent();
    }

    static void printGreatGpaStudent() {
        List<Student> students = StudentDataBase.getStudents();
        students.forEach(student -> {
            if(p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    static void printGreatGradeStudent() {
        List<Student> students = StudentDataBase.getStudents();
        students.forEach(student -> {
            if(p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    static void printGreatGpaAndGradeStudent() {
        List<Student> students = StudentDataBase.getStudents();
        students.forEach(student -> {
            if(p1.and(p2).test(student)) {
                System.out.println(student);
            }
        });
    }

    static void printNegateGreatGpaAndGradeStudent() {
        List<Student> students = StudentDataBase.getStudents();
        students.forEach(student -> {
            if(p1.and(p2).negate().test(student)) {
                System.out.println(student);
            }
        });
    }
}
