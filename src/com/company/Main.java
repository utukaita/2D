package com.company;

import java.lang.reflect.Array;

import static java.lang.StrictMath.abs;

public class Main {

    public static void main(String[] args) {
        int M = 7;
        int[][] weird = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++)
                weird[i][j] = (i + j) * 2 + i - j;
        }
        for (int[] row : weird)
            System.out.println(java.util.Arrays.toString(row));

        int[][] homework2 = new int[6][6];
        for (int i = 0; i < homework2.length; i++)
            homework2[i][0] = i;
        homework2[2][1] = -19;
        homework2[0][4] = 4;
        homework2[3][3] = 7;
        homework2[5][4] = 22;
        System.out.print("    ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + "   ");
        }
        System.out.println("");
        for (int[] row : homework2) {
            for (int num : row) {
                if (num < -9)
                    System.out.print(num + " ");
                else if (num > 9 || num < 0)
                    System.out.print(num + "  ");

                else
                    System.out.print(num + "   ");
            }
            System.out.println("");
        }
        System.out.println();
        int sum_all = 0;
        int max_col_amount = 0;
        int[][] sum = {{1, 2, 3}, {2, 3, 4}, {8, 7, 6, 5}};
        for (int[] row : sum){
            int sum_row = 0;
            int col_amount = 0;
            for (int i : row){
                sum_row += i;
                sum_all += i;
                col_amount += 1;
            }
            if (col_amount>max_col_amount)
                max_col_amount = col_amount;
            System.out.println(sum_row);
        }
        int col_sum[] = new int[max_col_amount];
        for (int[] row : sum){
            for (int i = 0; i < row.length; i++)
                col_sum[i] += row[i];

        }
        for (int i: col_sum)
            System.out.println(i);
        System.out.println(sum_all);
        int n = 5;
        int[][] spiral = new int[n][n];
        int z = 1;
        int TOP = 0;
        int BOTTOM = n-1;
        int LEFT  = 0;
        int RIGHT = n-1;
        while (z <= n*n && TOP<=BOTTOM && LEFT<=RIGHT) {
                for (int i = LEFT; i <= RIGHT; i++) {
                    spiral[TOP][i] = z;
                    z++;
                }
                for (int i = TOP + 1; i <= BOTTOM; i++) {
                    spiral[i][RIGHT] = z;
                    z++;
                }
                for (int i = RIGHT - 1; i >= LEFT; i--) {
                    spiral[BOTTOM][i] = z;
                    z++;
                }
                for (int i = BOTTOM - 1; i >= TOP + 1; i--) {
                    spiral[i][LEFT] = z;
                    z++;
                }
                TOP++;
                BOTTOM--;
                LEFT++;
                RIGHT--;
        }
        for (int[]row:spiral) {
            for (int i:row) {
                if (i < 10)
                    System.out.print(i + "  ");
                else
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}