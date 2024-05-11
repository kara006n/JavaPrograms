package com.java.program;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter total rows : ");
            int rows = sc.nextInt();

            System.out.println("Enter total column : ");
            int cols = sc.nextInt();

            int matrix1[][] = new int[rows][cols];

            System.out.println("please enter the original matrix :");

            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        matrix1[i][j] = sc.nextInt();
                  }
            }

            System.out.println("print matrix 1 data:");
            for (int[] r : matrix1) {
                  System.out.println(Arrays.toString(r));
            }


            for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < cols; j++) {
                        if(i<=j){
                              int temp = matrix1[i][j];
                              matrix1[i][j]=matrix1[j][i];
                              matrix1[j][i]=temp;
                        }
                  }
            }

            System.out.println("print transpose matrix:");
            for (int[] r : matrix1) {
                  System.out.println(Arrays.toString(r));
            }


      }

}
