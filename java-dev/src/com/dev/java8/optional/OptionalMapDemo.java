package com.dev.java8.optional;

import com.dev.java8.data.Bike;
import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;
import com.dev.pattern.solidPrinciple.OCPdemo;

import java.util.Arrays;
import java.util.Optional;

public class OptionalMapDemo {

    public static void main(String[] args) {
        // Optional map and filter demo
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudents().get(0));
        String name = studentOptional.filter(student -> student.getGpa() > 4.5).map(Student::getName).orElse("Default");
        System.out.println(name);

        // Optional flatmap demo
        Bike bike = new Bike();
        bike.setName("Honda");
        bike.setModel("XUV");
        Student student = new Student("Rit", 3, 3.5, "Male", Arrays.asList("Hockey", "Swimming", "Running" ));
        student.setBike(Optional.ofNullable(bike));

        Optional<Student> studentOptional1 = Optional.ofNullable(student);

        Optional<String> name1 = studentOptional1
                .flatMap(Student::getBike)
                .map(Bike::getName);
        System.out.println(name1);

    }
}
