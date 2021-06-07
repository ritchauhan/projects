package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionsDemo {

    public static void main(String[] args) {
        Function<Student, String> func = student -> student.getName();

//        StudentDataBase.getStudents().stream()
//                .map(func)
//                .forEach(name -> System.out.println(name));
        System.out.println(StudentDataBase.getStudents().get(0));
        System.out.println(func.andThen(student -> student.toUpperCase()).apply(StudentDataBase.getStudents().get(0)));
    }

    public static class ConsumerDemo {

        public static void main(String[] args) {
            Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
            consumer.accept("Java8");
            consumer.andThen(name -> System.out.println(name.toLowerCase())).accept("Enjoy");

        }
    }
}
