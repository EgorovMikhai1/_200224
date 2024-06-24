package org.example._2024_06_24;

import java.util.Arrays;

public class Tas {
    /**
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};

        System.out.println(Arrays.deepToString(ar));
        System.out.println("----------------------------------------------");

        new Tas().rotate(ar);

        System.out.println(Arrays.deepToString(ar));
    }

    public void rotate(int[][] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][n - j - 1];
                array[i][n - j - 1] = temp;
            }
        }
    }
}