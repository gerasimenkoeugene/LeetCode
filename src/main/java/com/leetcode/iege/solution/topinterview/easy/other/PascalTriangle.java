package com.leetcode.iege.solution.topinterview.easy.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> main = new ArrayList<>();

        if (n == 0) {
            return main;
        }
        if (n > 0) {
            main.add(Arrays.asList(new Integer [] {1}));
        }
        if (n > 1) {
            main.add(Arrays.asList(new Integer [] {1, 1}));
        }
        int count = 2;
        while (count < n) {
            List<Integer> array = new ArrayList<>(Arrays.asList(new Integer [] {1}));
            main.add(array);
            List<Integer> prev = main.get(count - 1);
            for (int i = 1; i < count; i++) {
                array.add(prev.get(i - 1) + prev.get(i));
            }
            array.add(1);
            count++;
        }

        return main;
    }
}
