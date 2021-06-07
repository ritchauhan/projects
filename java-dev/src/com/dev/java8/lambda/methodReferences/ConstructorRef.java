package com.dev.java8.lambda.methodReferences;

import com.dev.java8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRef {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String, Student> studentSupplier2 = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentSupplier2.apply("Ritesh"));
    }
}
