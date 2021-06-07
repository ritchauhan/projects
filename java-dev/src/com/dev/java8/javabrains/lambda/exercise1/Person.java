package com.dev.java8.javabrains.lambda.exercise1;

public class Person {
    private String fname;
    private String lname;
    private int age;

    public Person(String fname, String lname, int age) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return this.fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.getFname() + " " + this.getLname() + " " + this.getAge();
    }
}
