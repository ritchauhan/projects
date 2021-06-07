package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDemo {

    static Map<String, List<Student>> groupBy1() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName));
    }

    static Map<String, List<Student>> customizeGroupBy1() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() > 4 ? "Excellent" : "Average"));
    }

    static Map<Integer, Map<String, List<Student>>> groupBy2() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() > 4 ? "Excellent" : "Average")));
    }

    static Map<Integer, Optional<Student>> groupByMinBy() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
    }

    static Map<Integer, Student> groupByMaxBy() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    }


    static LinkedHashMap<Integer, Set<Student>> groupBy3() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, LinkedHashMap::new, Collectors.toSet()));
    }

    public static void main(String[] args) {
//        System.out.println(groupBy1());
//        System.out.println(customizeGroupBy1());
//        System.out.println(groupBy2());
//        System.out.println(groupByExtended2());
        System.out.println(groupByMaxBy());
        System.out.println(groupByMinBy());
//        System.out.println(groupBy3());
    }

}
