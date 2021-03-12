package com.dev.dp.pattern.solid.srpDemo;

import com.dev.dp.pattern.solid.srpDemo.Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * class to handle persistent concern
 */
public class Persistent {

    /**
     * function to save journal details in file
     * @param fileName
     * @param journal
     * @param override
     * @throws FileNotFoundException
     */
    public void saveToFile(String fileName, Journal journal, boolean override) throws FileNotFoundException {
        if (override || new File(fileName).exists()) {
            try (PrintStream printStream = new PrintStream(fileName)) {
                printStream.println(journal.toString());
            }
        }
    }
}
