package com.dev.java.collectionDemo.HashMapDemo;

import com.dev.java.collectionDemo.basics.Student;
import java.util.Map;
import java.util.HashMap;

public class BasicHashMap {
    public static void main(String[] args) {
        // object creation:
        Student student1 = new Student("Ritesh2", "Kumar3", 10, "IT");
        Student student2 = new Student("Ritesh1", "Kumars", 5, "IT");
        Student student3 = new Student("Ritesh3", "Chauhan", 1, "IT");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        // add
        studentMap.put(student1.getRoll(), student1);
        studentMap.put(student2.getRoll(), student2);
        studentMap.put(student3.getRoll(), student3);

        // get
//        System.out.println(studentMap);

        for(Integer roll : studentMap.keySet()) {
//            System.out.println(studentMap.get(roll));
        }

        for(Student student: studentMap.values()) {
//            System.out.println(student);
        }

        // other methods
        Student student = studentMap.getOrDefault(50, new Student("Ritesh50", "Kumar3", 50, "CS" ));
        System.out.println(student);
        studentMap.putIfAbsent(50, new Student("Ritesh50", "Kumar3", 50, "CS" ));
//        System.out.println(studentMap);

        // iterator
        studentMap.forEach((key, value) -> System.out.println(value));

        for(Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
