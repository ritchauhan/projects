package com.dev.java.interview.stack;

import java.util.Stack;

/**
 * Check for balance and unbalance string based on ( {} ) [] character.
 */
public class UnbalancePattern {
    static boolean checkPattern(String str) {
        Stack<Character> characters = new Stack<>();
        if(str.length() > 0) {
            for (char c : str.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    characters.push(c);
                } else if (c == ')') {
                    if (characters.pop() != '(') {
                        return false;
                    }
                } else if (c == '}') {
                    if (characters.pop() != '{') {
                        return false;
                    }
                } else if (c == ']') {
                    if (characters.pop() != '[') {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return characters.isEmpty();
    }
    public static void main(String[] args) {
        String str = "{Ab(s)}as[asa]";
        String str1 = "{ab(bc})";
        String str2 = "abdsf";
        System.out.println(checkPattern(str2));
    }
}

