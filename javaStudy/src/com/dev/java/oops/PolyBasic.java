package com.dev.java.oops;

class Animal {
    void move() {
        System.out.println("Animal moved !!");
    }

    void roar() {
        System.out.println("Animal roared !!");
    }
}

class Lion extends Animal {
    void roar () {
        System.out.println("Lion roared !!");
    }

    void jump() {
        System.out.println("Lion jumped !!");
    }
}
public class PolyBasic {
    void moveAnimal (Animal animal) {
        animal.move();
    }
    public static void main(String[] args) {
        Animal animal= new Lion();
        animal.roar();
        PolyBasic polyBasic = new PolyBasic();
        polyBasic.moveAnimal(animal);
    }
}
