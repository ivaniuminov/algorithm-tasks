package com.iuminov.medium;

public class _807MaxIncrease {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] topBottom = new int[grid.length];
        int[] leftRight = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > topBottom[i]) {
                    topBottom[i] = grid[i][j];
                }
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            for (int[] aGrid : grid) {
                if (aGrid[j] > leftRight[j]) {
                    leftRight[j] = aGrid[j];
                }
            }
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += Math.min(topBottom[i], leftRight[j]) - grid[i][j];
            }
        }

        return result;
    }
}
