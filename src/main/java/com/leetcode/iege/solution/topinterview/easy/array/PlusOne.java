package com.leetcode.iege.solution.topinterview.easy.array;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        boolean isAddOne = true;
        for(int i = digits.length - 1; i >= 0; i--) {
            int newVal = digits[i] + 1;
            if(newVal > 9) {
                digits[i] = 0;
            } else {
                digits[i] = newVal;
                isAddOne = false;
                break;
            }
        }

        if (isAddOne) {
            int [] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            return newDigits;
        }

        return digits;
    }
}
