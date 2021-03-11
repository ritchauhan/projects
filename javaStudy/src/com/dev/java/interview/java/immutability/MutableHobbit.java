package com.dev.java.interview.java.immutability;

import java.util.List;

public class MutableHobbit {
    private String name;
    private Address address;
    private List<String> stuffs;

    public MutableHobbit(String name, Address address, List<String> stuffs) {
        this.name = name;
        this.address = address;
        this.stuffs = stuffs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getStuffs() {
        return stuffs;
    }

    public void setStuffs(List<String> stuffs) {
        this.stuffs = stuffs;
    }
}
