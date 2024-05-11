package com.java.program;

public class SpecificCharCountInString {

      public static void main(String[] args) {

            String s = "hello";

            long l = s.chars().mapToObj(x -> String.valueOf((char) x)).filter(x -> x.equals("l")).count();
            //simply we are converting string to stream of unicode value of each character using chars()
            //now we can use mapToObject to map each unicode value to String(first typecast to char then use String.valueOf method on it)
            //then use filter to filter out all characters on basis of condition then count all that pass the condition.
            System.out.println(l);

            long count = s.chars().filter(x -> x == 'l').count();
            System.out.println(count);
      }
}
