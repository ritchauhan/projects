package com.dev.java.stream.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataBase {
    public static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ritesh", 4, 4.5, Arrays.asList("Cricket",
                "Book", "Cooking", "Sleeping")));
        studentList.add(new Student("Kumar", 3, 3.5, Arrays.asList("Cricket",
                "Walking")));
        studentList.add(new Student("Chauhan", 2, 3.9, Arrays.asList("Cricket",
                "Tennis", "Cooking")));
        studentList.add(new Student("Singh", 4, 4.9, Arrays.asList("Badminton",
                "Book", "sleeping")));

        return studentList;
    }
}
