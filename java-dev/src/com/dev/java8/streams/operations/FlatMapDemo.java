package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> activities = getStudentActivities();
        activities.forEach(activity -> System.out.println(activity));
        // activity count
        System.out.println(getStudentActivitiesCount());
    }

    private static List<String> getStudentActivities() {
        List<Student> students = StudentDataBase.getStudents();
        return students.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() // unique list
                .sorted() // sorted order
                .collect(Collectors.toList());
    }

    private static long getStudentActivitiesCount() {
        List<Student> students = StudentDataBase.getStudents();
        return students.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() // unique list
                .count(); // count of the unique students
    }
}
