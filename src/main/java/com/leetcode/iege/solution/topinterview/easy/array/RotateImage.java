package com.leetcode.iege.solution.topinterview.easy.array;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {

                int current = matrix[i][j];
                int temp = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = current;
                current = temp;

                temp = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = current;
                current = temp;

                temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = current;
                current = temp;

                matrix[i][j] = current;
            }
        }
    }
}
