package com.java.program;

public class StarPattern5 {

      public static void main(String[] args) {

            char ch =64;
            for (int i =1; i<=6; i++){
                  ch++;
                  for(int j =0; j<i; j++){
                        System.out.print((char)(ch)+" ");
                  }
                  System.out.println();
            }
      }
}
