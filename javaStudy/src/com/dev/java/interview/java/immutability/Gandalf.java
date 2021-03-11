package com.dev.java.interview.java.immutability;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Gandalf {
    private String hackedName;
    public Gandalf(String name, Address address, List<String> list) {
        hackedName = name;
    }

    public void setImmutableHackedName(String newName) {
        hackedName = newName;
    }

    public String getName() {
        return hackedName;
    }

    public static void main(String[] args) {
        Gandalf gandalf = new Gandalf("Test", new Address("Ka", "Bangalore")
                , Collections.emptyList());
        System.out.println(gandalf.getName());
        gandalf.setImmutableHackedName("Test123");
        System.out.println(gandalf.getName());
        // deep copy issue
        Address address = new Address("IN", "Hubli");
        List<String> stuffs = new ArrayList<>();
        stuffs.add("Ritesh");
        stuffs.add("Kumar");
        ImmutableHobbit immutableHobbit = new ImmutableHobbit("Immutability Test", address, stuffs);
        System.out.println(immutableHobbit.getName() + " "
                + immutableHobbit.getAddress().getCity() + " "
                + immutableHobbit.getStuffs().get(0));
        // this will break the immutability
        immutableHobbit.getAddress().setCity("Mysore");
        stuffs.remove(0);
        System.out.println(immutableHobbit.getName() + " "
                + immutableHobbit.getAddress().getCity() + " "
                + immutableHobbit.getStuffs().get(0));


    }
}
