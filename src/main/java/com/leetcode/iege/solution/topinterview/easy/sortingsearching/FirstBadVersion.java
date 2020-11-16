package com.leetcode.iege.solution.topinterview.easy.sortingsearching;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return findBadVersion(0, n);

    }

    private int findBadVersion(int left, int right) {
        int n = (right - left) / 2 + left;
        if (isBadVersion(n)) {
            if (!isBadVersion(n - 1)) {
                return n;
            } else {
                return findBadVersion(left, n);
            }
        } else {
            if (isBadVersion(n + 1)) {
                return n + 1;
            } else {
                return findBadVersion(n, right);
            }
        }
    }

    private int optimalBSearch(int l, int r) {
        while(l<r) {
            int m = l+(r-l)/2;
            if(isBadVersion(m))
                r=m;
            else
                l=m+1;
        }
        return l;
    }


    private boolean isBadVersion(int n) {
        return true;
    }
}
