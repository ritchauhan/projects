package com.dev.java.stream.data;

import java.util.List;

public class Student {
    private String name;
    private int grade;
    private double gpa;
    List<String> activities;

    public Student(String name, int grade, double gpa, List<String> activities) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", activities=" + activities +
                '}';
    }
}
