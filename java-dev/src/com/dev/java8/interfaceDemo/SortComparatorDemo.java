package com.dev.java8.interfaceDemo;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class SortComparatorDemo {

    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparingInt(Student::getGradeLevel);

    static void sortByName(List<Student> studentList) {
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
        studentList.sort(studentComparator);
        studentList.forEach(System.out::println);
    }

    static void sortByProperty(List<Student> students, Comparator<Student> studentComparator) {
        students.sort(studentComparator);
        students.forEach(System.out::println);
    }

    static void comparatorChaining(List<Student> studentList) {
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(System.out::println);
    }

    static void sortWithNullValue(List<Student> students) {
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        students.sort(studentComparator);
        students.forEach(student -> System.out.println(student));
    }

    public static void main(String[] args) {
        // sort by name
        System.out.println("Sort BY Name: ");
        List<Student> students = StudentDataBase.getStudents();
//        sortByName(students);

        System.out.println(" Sort BY GPA");
//        sortByProperty(students, Comparator.comparingDouble(Student::getGpa));

        System.out.println("Comparator Chaining: ");
//        comparatorChaining(students);

        System.out.println(" Comparator with null check: ");
        students.add(null);
        // it will throw null if don't use nullsFirst or nullsLast methods
        sortWithNullValue(students);
    }
}
