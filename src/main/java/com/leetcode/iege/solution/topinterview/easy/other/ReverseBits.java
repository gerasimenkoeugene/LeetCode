package com.leetcode.iege.solution.topinterview.easy.other;

public class ReverseBits {

    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++)
        {
            res<<=1;
            int end= n& 1; // store LSB
            res=res| end;
            n>>=1;
        }
        return res;
    }
}
