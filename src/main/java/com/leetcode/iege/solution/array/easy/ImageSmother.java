package com.leetcode.iege.solution.array.easy;

/**
 * Given an m x n integer matrix img representing the grayscale of an image,
 * return the image after applying the smoother on each cell of it.
 *
 * Input: img = [[100,200,100],[200,50,200],[100,200,100]]
 * Output: [[137,141,137],[141,138,141],[137,141,137]]
 * Explanation:
 * For the points (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137
 * For the points (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141
 * For the point (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138
 *
 */
public class ImageSmother {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] ans = new int[n][m];
        for(int i =0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                ans[i][j] = getSmoothVal(img, i, j);
            }
        }
        return ans;
    }

    public int getSmoothVal(int[][] M, int i, int j) {
        int sum = M[i][j];
        int count = 1;

        int m = M.length;
        int n = M[0].length;
        if(i - 1 >= 0) {
            sum += M[i - 1][j];
            count++;

            if(j - 1 >= 0) {
                sum += M[i - 1][j - 1];
                count++;
            }
            if(j + 1 < n) {
                sum += M[i - 1][j + 1];
                count++;
            }
        }
        if(i + 1 < m) {
            sum += M[i + 1][j];
            count++;

            if(j - 1 >= 0) {
                sum += M[i + 1][j - 1];
                count++;
            }
            if(j + 1 < n) {
                sum += M[i + 1][j + 1];
                count++;
            }
        }
        if(j - 1 >= 0) {
            sum += M[i][j - 1];
            count++;
        }
        if(j + 1 < n) {
            sum += M[i][j + 1];
            count++;
        }

        return sum / count;
    }
}
