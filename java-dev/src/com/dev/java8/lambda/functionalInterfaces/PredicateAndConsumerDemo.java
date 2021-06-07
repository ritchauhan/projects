package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerDemo {
    public static void main(String[] args) {
        // predicates
        Predicate<Student> p1 = student -> student.getGpa() > 3.5;
        Predicate<Student> p2 = student -> student.getGradeLevel() > 4;

        // consumers
        BiConsumer<String, List<String>> c1 = (name, activities) -> System.out.println(name + " : " + activities);
        Consumer<Student> c2 = student -> {
            if (p1.and(p2).test(student)) {
                c1.accept(student.getName(), student.getActivities());
            }
        };

        // test
        List<Student> students = StudentDataBase.getStudents();
        students.forEach(c2);
    }
}
