package com.java.program;

import java.util.stream.IntStream;

public class PrimeNumber {

      public static boolean isPrime(int number){

            if(number<=1)
                  return false;

            for(int i = 2; i<= Math.sqrt(number); i++){
                  if(number%i == 0){
                        return false;
                  }
            }
            return true;
      }

      public static boolean ifPrimeUsingStreams(int number){

            return number > 1 && IntStream.range(2, (int)Math.sqrt(number)+1).noneMatch(i -> number%i ==0);
      }

      public static void main(String[] args) {

            int number = 57;

            System.out.println(isPrime(57));
            System.out.println(ifPrimeUsingStreams(36));
      }
}
