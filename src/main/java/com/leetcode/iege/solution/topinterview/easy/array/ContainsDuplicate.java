package com.leetcode.iege.solution.topinterview.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(Integer num : nums) {
            if(!numsSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}
