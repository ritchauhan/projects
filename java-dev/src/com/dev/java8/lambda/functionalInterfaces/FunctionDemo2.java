package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo2 {
   static Function<List<Student>, HashMap<String, Double>> functions = students -> {
        HashMap<String, Double> studentMap = new HashMap<>();
        students.forEach(student -> {
            studentMap.put(student.getName(), student.getGpa());
        });
        return studentMap;
    };
    public static void main(String[] args) {
        System.out.println(functions.apply(StudentDataBase.getStudents()));
    }
}
