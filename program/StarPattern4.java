package com.java.program;

public class StarPattern4 {

      public static void main(String[] args) {

            char ch ='A';
            for (int i =1; i<=5; i++){
                  for(int j =0; j<i; j++){
                        System.out.print((char)(ch+j)+" ");
                  }
                  System.out.println();
            }

      }
}
