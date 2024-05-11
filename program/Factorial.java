package com.java.program;

public class Factorial {

      public static void main(String[] args) {

            int number = 5;
            System.out.println(factorial(number));
            System.out.println(factorialUsingRecursion(number));
      }

      private static int factorial(int number) {

            int sum = 1;
            for(int i =1; i<=number ; i++){
                  sum*=i;
            }
            return sum;
      }

      private static int factorialUsingRecursion( int number) {

            if(number ==0 || number == 1)
                  return 1;

            return number*factorial(number-1);
      }


}
