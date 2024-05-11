package com.java.program;

import java.util.Arrays;

//shift all zeros to right
public class Logic2 {

      public static void arrange(int[] input){

            int j = 0;
            for(int i=0; i< input.length; i++){
                  if(input[i]!=0){
                        int temp = input[i];
                        input[i]=input[j];
                        input[j]=temp;
                        j++;
                  }
            }
//            for(int i: input){
//                  System.out.print(i+" ");
//            }
            System.out.println(Arrays.toString(input));

      }

      public static void main(String[] args) {

            int[] input = new int[]{0,0,1,0,2,0,3,0,0,0};
            arrange(input);




      }
}
