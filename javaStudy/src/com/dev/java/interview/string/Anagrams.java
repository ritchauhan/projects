package com.dev.java.interview.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static int getValidCount(int[] str1, int[] str2) {
        int result = 0;
        if (str1.length != str2.length) {
            return -1;
        }
        for (int i=0; i<str1.length; i++) {
            int difference = Math.abs(str1[i] - str2[i]);
            result += difference;
        }
        return result;
    }

    public static int[] getCharArr(String s) {
        int[] charCount = new int[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int offset = (int) 'a';
            int code = c-offset;
            charCount[code]++;
        }
        return charCount;
    }

    public static HashMap<Character, Integer> getCount(String str) {
        HashMap<Character, Integer> charsMap = new HashMap<>();
        for (int i=0; i<str.length(); i++) {
            charsMap.put(str.charAt(i), charsMap.getOrDefault(str.charAt(i), 0) +1 );
        }
        return charsMap;
    }

    public static int  validCount (HashMap<Character, Integer> charMap1, HashMap<Character, Integer> charMap2) {
        int result = 0;
        for (Map.Entry<Character, Integer> entry : charMap1.entrySet()) {
            Character c = entry.getKey();
            if (charMap2.containsKey(c)) {
                result += entry.getValue() - charMap2.get(c);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "billion";
        String str3 = "fcrxzwscanmligyxyvym";
        String str4 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        // working fine
        System.out.println(getValidCount(getCharArr(str3), getCharArr(str4)));
        // need to explore this later with hashmap
//        System.out.println(validCount(getCount(str3), getCount(str4)));
    }
}
