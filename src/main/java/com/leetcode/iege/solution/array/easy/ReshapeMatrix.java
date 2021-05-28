package com.leetcode.iege.solution.array.easy;

/**
 * You are given an m x n matrix mat and two integers r and c representing the row number and column number of the wanted reshaped matrix.
 *
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
 *
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 *
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4
 * Output: [[1,2,3,4]]
 *
 * Input: mat = [[1,2],[3,4]], r = 2, c = 4
 * Output: [[1,2],[3,4]]
 */
public class ReshapeMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int pR = mat.length;
        int pC = mat[0].length ;

        if(pR * pC != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int pos = i * c + j;

                int pI = pos / pC;
                int pJ = pos - pI * pC;
                res[i][j] = mat[pI][pJ];
            }
        }

        return res;

    }
}
