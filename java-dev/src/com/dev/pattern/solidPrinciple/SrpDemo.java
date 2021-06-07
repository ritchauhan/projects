package com.dev.pattern.solidPrinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Single Responsibility principle demo class
 */
class Journal {
    private int count;
    private List<String> entries = new ArrayList<>();

    public void addEntries(String text) {
       entries.add(": " + count + " : " + text);
    }

    public void removeEntries(int index) {
        entries.remove(index);
    }

    public List<String> getEntries() {
        return entries;
    }

    /**
     * Adding persistent calls to save entries into a file
     * This is breaking SRP principle since this is related to persistence,
     * we can add this logic to persistence class and handle it generic
     *
     */
    public void saveEntriesToFile() {}
}

class Persistence {
    /**
     * We can move all the file related persistence method
     * in this file so we don't need to add same methods again in
     * multiple file and handle separately
     * this class point of concern is only persistence
     */
    public void addEntriesToFile() {}
    public void removeEntriesFromFile(int index) {}
}

public class SrpDemo {

    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntries("Ritesh");
        journal.addEntries("Kumar");
        System.out.println(" Before delete : " + journal.getEntries());
        journal.removeEntries(1);
        System.out.println(" After delete: " + journal.getEntries());
    }
}
