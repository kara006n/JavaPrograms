package com.java.program;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter total rows : ");
            int rows = sc.nextInt();

            System.out.println("Enter total column : ");
            int cols = sc.nextInt();

            int matrix1[][] = new int[rows][cols];
            int matrix2[][] = new int[rows][cols];
            int sum[][] = new int[rows][cols];

            System.out.println("please enter the matrix 1 data:");

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        matrix1[i][j] = sc.nextInt();
                  }
            }

            System.out.println("please enter the matrix 2 data:");

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        matrix2[i][j] = sc.nextInt();
                  }
            }

            System.out.println("print matrix 1 data:");
            for (int[] r : matrix1) {
                  System.out.println(Arrays.toString(r));
            }

            System.out.println("print matrix 2 data:");
            for (int[] r : matrix2) {
                  System.out.println(Arrays.toString(r));
            }

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        sum[i][j] = matrix1[i][j]+ matrix2[i][j];
                  }
            }

            System.out.println("print sum matrix:");
            for (int[] r : sum) {
                  System.out.println(Arrays.toString(r));
            }


      }

}