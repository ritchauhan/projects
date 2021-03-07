package com.dev.java.interview.hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Find if ransom note is valid
 * If note words are present in message and it should more frequent than message.
 */
public class RansomNote {

    private static HashMap<String, Integer> getMessageMapped (String[] message) {
        HashMap<String, Integer> messageMap = new HashMap<>();
        for (String str : message) {
            messageMap.put(str, messageMap.getOrDefault(str, 1) + 1);
        }
        return messageMap;
    }

    private static boolean isRansomNoteValid(HashMap<String, Integer> messageMap,
                                             HashMap<String, Integer> noteMap) {
        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            String word = entry.getKey();
            if ((!messageMap.containsKey(word)) || entry.getValue() > messageMap.get(word)) {
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] message = {"Your", "Son", "Is", "Safe", "Son"};
        String[] note = {"Your", "Son", "Is", "Safe"};
        HashMap<String, Integer> messageMap = getMessageMapped(message);
        HashMap<String, Integer> noteMap = getMessageMapped(note);
        boolean ransomResult = isRansomNoteValid(messageMap, noteMap);
        System.out.println(ransomResult);
    }
}
