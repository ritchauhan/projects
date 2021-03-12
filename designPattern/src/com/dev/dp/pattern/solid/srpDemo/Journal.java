package com.dev.dp.pattern.solid.srpDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to demo single responsibility principle
 * This class should have only journal related methods
 */
public class Journal {
    private List<String> entries = new ArrayList<>();
    private int count = 0;

    /**
     * function to write entries to journal
     * @param text
     */
    public void add(String text) {
        entries.add(" " + count ++  +": " +text);
    }

    /**
     * function to remove the entries from journal
     * @param index
     */
    public void remove(int index) {
        entries.remove(index);
    }

    /**
     * function to return string output of journal
     * @return
     */
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    /**
     * these function will not follow the single responsibility principle
     * since these point of concern is persisten so it should be done separately
     * @param fileName
     */
    // public void saveJournal(String fileName){};
    // public Journal loadJournal(String fileName){};

    /**
     * test method
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String fileName = "text.txt";
        Journal journal = new Journal();
        journal.add("this is new item");
        journal.add("add it to requirement");
        System.out.println(journal.toString());
        Persistent persistent = new Persistent();
        persistent.saveToFile(fileName, journal, true);
        // to open notepad directly from code
        Runtime.getRuntime().exec("notepad.exe " + fileName);
        journal.remove(0);
        System.out.println(journal.toString());
    }
}
