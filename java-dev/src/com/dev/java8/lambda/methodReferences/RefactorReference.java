package com.dev.java8.lambda.methodReferences;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorReference {

    static Predicate<Student> predicate = RefactorReference::testStudent;

    private static boolean testStudent(Student student) {
        return student.getGradeLevel()>4;
    }

    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.getStudents().get(4)));
    }
}
