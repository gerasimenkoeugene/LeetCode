package com.leetcode.iege.solution;

public class LengthOfLastWord58 {

    public int lengthOfLastWord(String s) {
        int lastIndex = -1;
        int firstIndex = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && lastIndex == -1) lastIndex = i;
            if (s.charAt(i) == ' ' && lastIndex != -1 && firstIndex == -1) {
                firstIndex = i;
                break;
            }
        }
        return lastIndex == -1 ? 0 : s.substring(firstIndex + 1, lastIndex + 1).length();
    }
}
