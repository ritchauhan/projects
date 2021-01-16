package com.dev.java.genericsDemo.zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> cage = new Cage();
        cage.setAnimal1(new Monkey());
        cage.setAnimal2(new Monkey());
        Cage<Monkey> cage1 = new Cage<Monkey>(new Monkey(), new Monkey());
        System.out.println(cage.getAnimal1());
        System.out.println(cage1.getAnimal2());

//        Cage<Integer> test = new Cage<Integer>(); // this will not be allowed since it is not Animal type.
    }
}
