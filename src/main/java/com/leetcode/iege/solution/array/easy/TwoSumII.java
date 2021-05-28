package com.leetcode.iege.solution.array.easy;

/*
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
 */
public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int res[]={-1,-1};
        for(int i=0,j=numbers.length-1;i<j;)
        {
            if(numbers[i]+numbers[j]==target)
            {
                res[0]=i+1;
                res[1]=j+1;
                return res;
            }
            if(numbers[i]+numbers[j]>target)
            {
                j--;
            }else
            {
                i++;
            }
        }
        return res;
    }
}
