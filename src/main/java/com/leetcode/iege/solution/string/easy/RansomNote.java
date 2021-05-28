package com.leetcode.iege.solution.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            Character ch = magazine.charAt(i);
            if (chars.containsKey(ch)) {
                chars.put(ch, chars.get(ch) + 1);
            } else {
                chars.put(ch, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            Character ch = ransomNote.charAt(i);

            if (chars.containsKey(ch)) {
                int count = chars.get(ch);
                if (count == 1) {
                    chars.remove(ch);
                } else {
                    chars.put(ch, count - 1);
                }

            } else {
                return false;
            }
        }

        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if(ransomNote == "" || ransomNote == null ) return true;

        int[] lookup = new int[26];
        for(int i=0; i< magazine.length(); i++) {
            ++lookup['z' - magazine.charAt(i)];
        }
        for(int i =0; i< ransomNote.length(); i++) {
            if(lookup['z' - ransomNote.charAt(i)] == 0) {
                return false;
            }
            --lookup['z' - ransomNote.charAt(i)];
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.printf('9' - '0' + " fdf");
    }
}
