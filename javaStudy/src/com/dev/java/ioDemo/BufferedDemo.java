package com.dev.java.ioDemo;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException{
        copyCharacter();
    }

    static void copyCharacter() throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("test.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

            String str = null;

            while ((str = bufferedReader.readLine()) !=null) {
                System.out.println(str);
                bufferedWriter.write(str);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
        ;
    }
}
