package com.dev.java8.streams.terminatalOperator;

import com.dev.java8.data.Student;
import com.dev.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningDemo {

    static Map<Boolean, List<Student>> partitioningBy1() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGradeLevel() > 4));
    }

    static Map<Boolean, Set<Student>> partitioningBy2() {
        return StudentDataBase.getStudents()
                .stream()
                .collect(Collectors.partitioningBy((student -> student.getGradeLevel() > 4), Collectors.toSet()));
    }
    public static void main(String[] args) {
        System.out.println(partitioningBy1());
        System.out.println(partitioningBy2());
    }
}
