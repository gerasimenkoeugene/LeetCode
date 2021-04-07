package com.leetcode.iege.solution.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 */
public class PascaleTriangle2 {

        public List<Integer> getRow(int rowIndex) {
            List<Integer> res = new ArrayList<>();
            long num = 1;
            res.add(1);

            for (int i = 1; i <= rowIndex; i++) {
                num *= (rowIndex-i+1);
                num /= i;
                res.add((int)num);
            }
            return res;
        }

    public static void main(String[] args) {
        System.out.println(new PascaleTriangle2().getRow(9));
    }
}
