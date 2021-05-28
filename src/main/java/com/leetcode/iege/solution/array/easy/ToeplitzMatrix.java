package com.leetcode.iege.solution.array.easy;

/**
 * Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
 *
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 *
 * Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * Output: true
 * Explanation:
 * In the above grid, the diagonals are:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 * In each diagonal all elements are the same, so the answer is True.
 *
 * Input: matrix = [[1,2],[2,2]]
 * Output: false
 * Explanation:
 * The diagonal "[1, 2]" has different elements.
 *
 * Solution:
 * We ask what feature makes two coordinates (r1, c1) and (r2, c2) belong to the same diagonal?
 *
 * It turns out two coordinates are on the same diagonal if and only if r1 - c1 == r2 - c2.
 *
 * This leads to the following idea: remember the value of that diagonal as groups[r-c].
 * If we see a mismatch, the matrix is not Toeplitz; otherwise it is.
 */
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length - 1; ++r)
            for (int c = 0; c < matrix[0].length - 1; ++c)
                if (matrix[r + 1][c + 1] != matrix[r][c])
                    return false;
        return true;
    }
}
