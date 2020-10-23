package com.leetcode.iege.solution.topinterview.easy.string;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !check(s.charAt(i))) i++;
            while (i < j && !check(s.charAt(j))) j--;
            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
        }
        return true;
    }

    private boolean check(char ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'
                || ch >= '0' && ch <= '9';
    }
}
