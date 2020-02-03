package com.leetcode.iege.solution.topinterview;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 */
public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Set<Character> notUniqueChars = new HashSet<>();
        int index = 0;
        for(Character character : s.toCharArray()) {
            if (map.containsKey(character)) {
                notUniqueChars.add(character);
                map.remove(character);
            } else {
                if (!notUniqueChars.contains(character)) {
                    map.put(character, index);
                }
            }
            index++;
        }

        for (Character character : map.keySet()) {
            return map.get(character);
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInString().firstUniqChar("dddccdbba"));
    }
}
