package com.dev.java.interview.java.immutability;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo to create class as immutable.
 a. removing setters.
 b. adding all args constructor since we don't have setter so it will be easy to set values.
 c. marking class as final to protect it from being extended.
 d. initializing all non-primitive mutable fields via constructor by performing a deep copy.
 e. performing cloning of the returned non-primitive mutable object in getter methods.
 f. marking all class fields as final (optional).
 */
public final class ImmutableHobbit {
    private final String name;
    private final Address address;
    private final List<String> stuffs;

    public ImmutableHobbit(String name, Address address, List<String> stuffs) {
        this.name = name;
        // deep copy issue with this
        // this.address = address;
        // this.stuffs = stuffs;

        // for fixing deep copy issue
        this.address = new Address(address.getCountry(), address.getCity());
        this.stuffs = new ArrayList<>(stuffs);


    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        // return address; deep cloning getter issue
        // to fix deep cloning issue
        return new Address(address.getCountry(), address.getCity());
    }

    public List<String> getStuffs() {
        // return address deep cloning getter issue
        // to fix deep cloning issue
        return new ArrayList<>(stuffs);
    }
}
