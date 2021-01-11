package com.dev.java.oops;

public class Car implements DiselCar, PetrolCar{
    @Override
    public void show() {
        System.out.println("show methods: !!");
    }

    @Override
    public void refuel() {
        System.out.println("refuel methods: !!");
    }

    public static void main(String[] args) {
        DiselCar diselCar = new Car();
        diselCar.show();
        PetrolCar petrolCar = (PetrolCar) diselCar;
        petrolCar.refuel();
    }
}
