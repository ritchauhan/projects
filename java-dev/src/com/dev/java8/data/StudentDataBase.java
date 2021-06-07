package com.dev.java8.data;

import com.dev.java8.data.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        // 3rd standard students
        students.add(new Student("Ritesh", 3, 3.5, "Male", Arrays.asList("Hockey", "Swimming", "Running" )));
        students.add(new Student("Kumari", 3, 3.5, "Female", Arrays.asList("Cricket", "Swimming", "Running" )));

        // 4th standard students
        students.add(new Student("Alka", 4, 3.8, "Female", Arrays.asList("Hockey", "Cricket", "Running" )));
        students.add(new Student("Chauhan", 4, 3.9, "Male", Arrays.asList("Hockey", "Cricket", "Swimming" )));

        // 5th standard students
        students.add(new Student("Avishek", 5, 4.2, "Male", Arrays.asList("Hockey", "Cricket", "Chess" )));
        students.add(new Student("Amita", 5, 4.9, "Female", Arrays.asList("Hockey", "Cricket", "Reading" )));
        return students;
    }
}
