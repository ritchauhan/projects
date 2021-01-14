package com.dev.java.collectionDemo.basics;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String fname;
    private String lname;
    private int roll;
    private String branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(fname, student.fname) && Objects.equals(lname, student.lname) && Objects.equals(branch, student.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, roll, branch);
    }

    public Student(String fname, String lname, int roll, String branch) {
        this.fname = fname;
        this.lname = lname;
        this.roll = roll;
        this.branch = branch;
    }

    public String toString() {
        return this.fname + " " + this.lname + " " + this.roll + " "+ this.branch;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getRoll() {
        return this.roll;
    }

    public String getFname() {
        return this.fname;
    }

    public String getLname() {
        return this.lname;
    }


    @Override
    public int compareTo(Student o) {
        return this.roll - o.getRoll();
    }
}
