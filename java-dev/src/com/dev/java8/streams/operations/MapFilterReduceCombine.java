package com.dev.java8.streams.operations;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;

public class MapFilterReduceCombine {

    static int getTotalStudentByGrade(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGpa() > 3.5)
                .filter(student -> student.getGender().equals("Female"))
                .map(Student::getGradeLevel)
//                .reduce(0, (a,b) -> a+b);
                .reduce(0, Integer::sum); // alternate way to do the summation
    }


    public static void main(String[] args) {
        System.out.println("Student total grade is : " + getTotalStudentByGrade(StudentDataBase.getStudents()));
    }
}
