package com.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxArray {

      public static void main(String[] args) {

            int array [] = {32, 55, 12, 67, 98, 45, 56,67};

            System.out.println("Using iterations");
            int min = 32;
            int max = 32;
            for(int x: array){
                  if(x>max){
                        max = x;
                  }
                  if(x<min){
                        min = x;
                  }
            }
            System.out.println("Maximum element is "+max);
            System.out.println("Minimum element is "+min);

            System.out.println("Using Arrays method");
            Arrays.sort(array);
            System.out.println("Maximum element is "+array[array.length-1]);
            System.out.println("Minimum element is "+array[0]);


            System.out.println("Using Streams");
            System.out.println("Maximum element is "+Arrays.stream(array).max().getAsInt());
            System.out.println("Minimum element is "+Arrays.stream(array).min().getAsInt());

            System.out.println("Using Collections");
            List<Integer> list = new ArrayList<>();
            for(int x: array){
                  list.add(x);
            }
            System.out.println("Maximum element is "+Collections.max(list));
            System.out.println("Minimum element is "+Collections.min(list));



      }
}
