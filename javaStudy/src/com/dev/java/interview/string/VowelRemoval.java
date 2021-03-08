package com.dev.java.interview.string;
import java.util.List;
import java.util.Arrays;

public class VowelRemoval {
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

//        StringBuffer sb = new StringBuffer(str);

           StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if(!al.contains(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }


        return sb.toString();
    }
    // Driver method to test the above function
    public static void main(String[] args)
    {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";

        System.out.println(remVowel(str));
    }
}
