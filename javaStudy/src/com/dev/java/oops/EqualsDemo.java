package com.dev.java.oops;

public class EqualsDemo {

    String name = "Ritesh";
    int roll = 10;

    public boolean equals(Object o) {
        if  (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;

        EqualsDemo equalsDemo = (EqualsDemo) o;

        if(equalsDemo.roll != roll) return false;
        return name.equals(equalsDemo.name);
    }

    public static void main(String[] args) {
        EqualsDemo equalsDemo = new EqualsDemo();
        EqualsDemo equalsDemo1 = new EqualsDemo();
        System.out.println(equalsDemo.equals(equalsDemo1));
    }
}
