package com.leetcode.iege.solution.topinterview.easy.string;

public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        s = s.trim();
        boolean negativeNumber = false;
        String stringMax = "2147483647";
        String stringMin = "2147483648";
        if  (s.equals("") || s.equals("+") || s.equals("-")) {
            return 0;
        }
        if (s.charAt(0) == '-') {
            if  (s.charAt(1) < '0' || s.charAt(1) > '9') {
                return 0;
            }
            s = s.substring(1);
            negativeNumber = true;
        }
        if (s.charAt(0) == '+') {
            if  (s.charAt(1) < '0' || s.charAt(1) > '9') {
                return 0;
            }
            s = s.substring(1);
        }
        String result = "";
        for (int i = 0; i < s.length();) {
            if (result.length() == 0 && s.charAt(i) == '0') {
                continue;
            }
            if  (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            if  (i > 9) {
                return negativeNumber ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result + s.charAt(i);

            if (i == 9) {
                if  (negativeNumber && stringMin.compareTo(result) == -1) {
                    return Integer.MIN_VALUE;
                }
                if  (!negativeNumber && stringMax.compareTo(result) == -1) {
                    return Integer.MAX_VALUE;
                }
            }
            i++;
            System.out.println(result);
        }
        if  (result.equals("")) {
            return 0;
        }
        return Integer.valueOf(negativeNumber ? '-' + result : result);
    }

    public static void main(String[] args) {
        System.out.println("2147483648".compareTo("2237483648"));
    }
}
