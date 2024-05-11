package com.java.program;

import java.util.Arrays;
import java.util.OptionalDouble;

//average of array
public class Average {

      public static void main(String[] args) {

            int [] array = {2, 3, 4, 5, 3, 4, 1, 2, 8, 9};
            int sum = Arrays.stream(array).sum();
            OptionalDouble average = Arrays.stream(array).average();
            System.out.println(sum/ array.length);
            System.out.println(average.getAsDouble());
      }
}
