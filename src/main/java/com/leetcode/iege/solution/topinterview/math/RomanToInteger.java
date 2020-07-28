package com.leetcode.iege.solution.topinterview.math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<Character, Integer> romanInteger = new HashMap<>();

    static {
        romanInteger.put('I', 1);
        romanInteger.put('V', 5);
        romanInteger.put('X', 10);
        romanInteger.put('L', 50);
        romanInteger.put('C', 100);
        romanInteger.put('D', 500);
        romanInteger.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result  = 0;
        for (int i = 0; i < s.length(); i++) {
            int number = romanInteger.get(s.charAt(i));
            if (number == 1) {
                Character nextRomanNumber = getNextOne(i, s);
                if ('V' == nextRomanNumber || 'X' == nextRomanNumber) {
                    number = number * -1;
                }
            }
            if (number == 10) {
                Character nextRomanNumber = getNextOne(i, s);
                if ('L' == nextRomanNumber || 'C' == nextRomanNumber) {
                    number = number * -1;
                }
            }
            if (number == 100) {
                Character nextRomanNumber = getNextOne(i, s);
                if ('D' == nextRomanNumber || 'M' == nextRomanNumber) {
                    number = number * -1;
                }
            }
            result = result + number;
        }
        return result;
    }

    public Character getNextOne(int currentPosition, String romanNumber) {
        if (currentPosition == romanNumber.length() - 1) {
            return 'W';
        }
        return romanNumber.charAt(currentPosition + 1);
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
    }
}
