package com.dev.java.interview.stack;

import java.util.Stack;

/**
 * Check for balance and unbalance string based on ( {} ) [] character.
 */
public class UnbalancePattern {
    static boolean checkPattern(String str) {
        Stack<Character> chars = new Stack<Character>();
        for (char c: str.toCharArray()) {
            if (c=='(') {
                chars.push(')');
            } else if (c== '{') {
                chars.push('}');
            } else if (c=='[') {
                chars.push(']');
            } else if (chars.isEmpty() || c!= chars.pop()){
                return false;
            }
        }
        return chars.isEmpty();
    }
    public static void main(String[] args) {
        String str = "{Ab(s)}as[asa]";
        String str1 = "{ab(bc})";
        String str2 = "[][]";
        System.out.println(checkPattern(str2));
    }
}

