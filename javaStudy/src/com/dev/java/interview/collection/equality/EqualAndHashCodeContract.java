package com.dev.java.interview.collection.equality;

import java.util.*;

/**
 * To test equal and hashcode contract
 * if hashcode method is not overridden then most of part gives wrong result
 */
public class EqualAndHashCodeContract {

    public static void main(String[] args) {
        Map<Employee, String> eMap = getEmployeeMap();
        Employee e1 = new Employee(101, "Ritesh");
        // this should have return R but since hashcode were not there so it returned null
        System.out.println(eMap.get(e1)); // null
        addEmployeeIntoSet();
    }

    // adding employees into set to verify hashcode contract
    public static void addEmployeeIntoSet() {
        Set<Employee> employeeSet = new HashSet<>();
        Employee e1 = new Employee(101, "Ritesh");
        Employee e2 = new Employee(102, "Kumar");
        Employee e3 = new Employee(101, "Ritesh");
        Employee e4 = new Employee(105, "Kumar1");
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.stream().forEach(emp -> System.out.println(emp));
    }

    public static Map<Employee, String> getEmployeeMap() {
        Map<Employee, String> empMap = new HashMap<>();
        Employee e1 = new Employee(101, "Ritesh");
        Employee e2 = new Employee(102, "Kumar");
        empMap.put(e1, "R");
        empMap.put(e2, "K");

        return empMap;
    }


}

class Employee {
    private int empId;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
}
