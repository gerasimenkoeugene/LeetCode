package com.leetcode.iege.solution.topinterview.easy.string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        int minLength = Integer.MAX_VALUE;
        for (String str : strs ) {
            minLength = Math.min(minLength, str.length());
        }
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    return result;
                }
            }
            result = result + strs[0].charAt(i);
        }

        return result;
    }
}
