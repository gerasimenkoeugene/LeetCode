package com.leetcode.iege.solution.topinterview.easy.array;

import java.util.*;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cube = new HashMap<>();
        List<Set<Character>> horizontal = new ArrayList<>();
        List<Set<Character>> vertical = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            cube.put(i, new HashSet<>());
            horizontal.add(new HashSet<>());
            vertical.add(new HashSet<>());
        }

        for (int i = 0; i< 9; i++) {
            for (int j = 0; j < 9; j++) {
                char sign = board[i][j];
                int cubeNumber = i /3 % 3 * 3 + j / 3 % 3;
                if (sign != '.') {
                    if (cube.get(cubeNumber).contains(sign) || horizontal.get(j).contains(sign)
                            || vertical.get(i).contains(sign)) {
                        return false;
                    } else {
                        cube.get(cubeNumber).add(sign);
                        horizontal.get(j).add(sign);
                        vertical.get(i).add(sign);
                    }
                    System.out.println(cube);
                }


            }
        }

        return true;
    }

    public static void main(String[] args) {
        char [][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(new ValidSudoku().isValidSudoku(board));
    }
}
