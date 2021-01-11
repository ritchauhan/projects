package com.dev.java.classDemo;

public class Car {
    int speed;
    String color;
    public Car() {
        this.color = "Red";
    }
    public Car(int speed) {
//        this();
        this.color = "Blue";
       this.speed = 150;
    }

    public void setColor(Car c) {
      c.color = "Green";
    }

    public static void main(String[] args) {
        Car car = new Car();
        int speed = 100;
        Car car1 = new Car(speed);
        System.out.println(speed);
        System.out.println(car.speed);
        System.out.println(car1.speed);
        System.out.println(car1.color);
        car.setColor(car1);
        System.out.println(car.color);
        System.out.println(car1.color);
    }
}
