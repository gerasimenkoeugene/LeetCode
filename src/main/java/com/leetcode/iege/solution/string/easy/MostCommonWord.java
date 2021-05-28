package com.leetcode.iege.solution.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned.
 * It is guaranteed there is at least one word that is not banned, and that the answer is unique.
 *
 * The words in paragraph are case-insensitive and the answer should be returned in lowercase.
 *
 *
 *
 * Example 1:
 *
 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 * Output: "ball"
 * Explanation:
 * "hit" occurs 3 times, but it is a banned word.
 * "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
 * Note that words in the paragraph are not case sensitive,
 * that punctuation is ignored (even if adjacent to words, such as "ball,"),
 * and that "hit" isn't the answer even though it occurs more because it is banned.
 * Example 2:
 *
 * Input: paragraph = "a.", banned = []
 * Output: "a"
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedList = new HashSet<>();

        for(String str: banned) {
            bannedList.add(str);
        }

        char[] chars = paragraph.toCharArray();

        StringBuilder wordBuffer = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        int maxCount = 0;
        String ans = "";

        for(int i=0; i<chars.length; i++) {
            char c = chars[i];

            if(Character.isLetter(c)) {
                wordBuffer.append(Character.toLowerCase(c));
                if(i != chars.length-1) {
                    continue;
                }
            }

            if(wordBuffer.length()>0) {
                String word = wordBuffer.toString();
                if(!bannedList.contains(word)) {
                    int newCount = map.getOrDefault(word,0)+1;
                    map.put(word, newCount);

                    if(newCount > maxCount) {
                        maxCount = newCount;
                        ans = word;
                    }
                }

                wordBuffer = new StringBuilder();
            }
        }

        return ans;
    }
}
