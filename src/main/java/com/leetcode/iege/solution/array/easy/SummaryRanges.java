package com.leetcode.iege.solution.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is
in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"

 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (nums.length == 0) return ans;
        int start = 0, end = 0;
        for (int i = 0 ; i< nums.length ;i++){
            while(i < nums.length-1 && nums[i]+1 == nums[i + 1]){
                end++;
                i++;
            }
            if(start == end){
                ans.add(String.valueOf(nums[start]));
            }
            else{
                sb.append(nums[start]);
                sb.append("->");
                sb.append(nums[end]);
                ans.add(sb.toString());
                sb.setLength(0);
            }
            end++;
            start = end;
        }
        return ans;
    }
}
