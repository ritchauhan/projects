package com.dev.java8.lambda.methodReferences;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class MethodRef2 {

    static Consumer<Student> studentConsumer = student -> System.out.println(student.getName());
    // Method references
    static Consumer<Student> studentConsumer1 = System.out::println;

    public static void main(String[] args) {
        studentConsumer.accept(StudentDataBase.getStudents().get(0));
        studentConsumer1.accept(StudentDataBase.getStudents().get(0));
    }
}
