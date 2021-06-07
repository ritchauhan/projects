package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo {
    public static BiFunction<List<Student>, Predicate<Student>, Map<Student, Double>> biFunction = ((students, studentPredicate) -> {
        Map<Student, Double> studentMap = new HashMap<>();
        for(Student student : students) {
            if(studentPredicate.test(student))
                studentMap.put(student, student.getGpa());
        }
        return studentMap;
    });
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getStudents(), PredicateDemo2.p1));
    }
}
