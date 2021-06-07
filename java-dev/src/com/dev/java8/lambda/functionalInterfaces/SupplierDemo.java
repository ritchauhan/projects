package com.dev.java8.lambda.functionalInterfaces;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static Supplier<List<Student>> studentSuppliers = () -> StudentDataBase.getStudents();

    public static void main(String[] args) {
        System.out.println(studentSuppliers.get());
    }
}
