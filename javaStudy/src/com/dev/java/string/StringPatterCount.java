package com.dev.java.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPatterCount {

    public static void main(String[] args) {
        String str = "helloaisddfhellosdsfhillofdsfhello";
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher(str);
        int occurrences = 0;
        while (matcher.find()) {
            occurrences ++;
        }
        System.out.println(occurrences);
    }
}
