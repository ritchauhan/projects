package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class ReduceDemo2 {

    static Optional<Student> getHighestGpaStudent(List<Student> students) {
        return students.stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
    }

    public static void main(String[] args) {
        System.out.println(getHighestGpaStudent(StudentDataBase.getStudents()).get());

    }
}
