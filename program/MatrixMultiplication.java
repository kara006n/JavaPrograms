package com.java.program;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter total rows for first matrix : ");
            int rows1 = sc.nextInt();

            System.out.println("Enter total column for first matrix or rows in second matrix: ");
            int cols1 = sc.nextInt();
            int rows2 = cols1;

            System.out.println("Enter total column for second matrix: ");
            int cols2 = sc.nextInt();

            int matrix1[][] = new int[rows1][cols1];
            int matrix2[][] = new int[rows2][cols2];
            int mul[][] = new int[rows1][cols2];

            System.out.println("please enter the matrix 1 data:");

            for (int i = 0; i < rows1; i++) {
                  for (int j = 0; j < cols1; j++) {
                        matrix1[i][j] = sc.nextInt();
                  }
            }

            System.out.println("please enter the matrix 2 data:");

            for (int i = 0; i < rows2; i++) {
                  for (int j = 0; j < cols2; j++) {
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

            for (int i = 0; i < rows1; i++) {
                  for (int j = 0; j < cols2; j++) {
                        for(int k=0; k<rows2; k++){
                              mul[i][j]+= matrix1[i][k]* matrix2[k][j];
                        }
                        //System.out.print(mul[i][j]+" ");
                  }
            }

            System.out.println("print multiplication matrix:");
            for (int[] r : mul) {
                  System.out.println(Arrays.toString(r));
            }


      }

}
