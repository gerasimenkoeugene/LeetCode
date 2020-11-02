package com.leetcode.iege.solution.topinterview.easy.string;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if  (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j + 1 == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
