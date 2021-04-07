package com.leetcode.iege.solution.topinterview.easy.string;


public class StringToIntegerAtoi {

    public int myAtoi2(String s) {
        boolean negativeNumber = false;
        String stringMax = "2147483647";
        String stringMin = "2147483648";
        if (s.equals("") || s.equals("+") || s.equals("-")) {
            return 0;
        }

        if (s.charAt(0) == '-') {
            if (s.charAt(1) < '0' || s.charAt(1) > '9') {
                return 0;
            }
            s = s.substring(1);
            negativeNumber = true;
        }
        if (s.charAt(0) == '+') {
            if (s.charAt(1) < '0' || s.charAt(1) > '9') {
                return 0;
            }
            s = s.substring(1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                s = s.substring(i);
                break;
            }
        }
        String result = "";
        for (int i = 0; i < s.length(); ) {
            if (result.length() == 0 && s.charAt(i) == '0') {
                i++;
                continue;
            }
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            if (i > 9) {
                return negativeNumber ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result + s.charAt(i);

            if (i == 9) {
                if (negativeNumber && stringMin.compareTo(result) < 0) {
                    return Integer.MIN_VALUE;
                }
                if (!negativeNumber && stringMax.compareTo(result) < 0) {
                    return Integer.MAX_VALUE;
                }
            }
            i++;

        }
        if (result.equals("")) {
            return 0;
        }
        return Integer.valueOf(negativeNumber ? '-' + result : result);
    }

    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            }

            if (s.charAt(i) == '-') {
                if (i == s.length() - 1 || s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9') {
                    return 0;
                }
                sign = -1;
                i++;
                break;
            }
            if (s.charAt(i) == '+') {
                if (i == s.length() - 1 || s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9') {
                    return 0;
                }
                i++;
                break;
            }
            if (s.charAt(i) >= '0' || s.charAt(i) <= '9') {
                break;
            }

        }

        while (i < s.length()) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                break;
            }
            if (sign == -1 && Integer.MIN_VALUE + result > -10) {
                return  Integer.MIN_VALUE;
            }
            if (sign == 1 && Integer.MAX_VALUE - result < 10) {
                return  Integer.MAX_VALUE;
            }

            if (result / 100000000 >= 1) {
                if (Integer.MAX_VALUE/10<result || Integer.MAX_VALUE - (s.charAt(i)-'0') < result * 10) {
                    return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }

            result = result * 10 + (s.charAt(i) - '0');
            i++;

        }
        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(new StringToIntegerAtoi().myAtoi("-91283472332\"") );
        System.out.println(new StringToIntegerAtoi().myAtoi("-2147483649") );
    }
}
