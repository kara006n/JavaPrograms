package com.java.program;

public class Armstrong {

      public static boolean checkNumber(int number){
            //Integer.toString(number);
            int length = String.valueOf(number).length();
            //System.out.println(length);
            int original  = number;
            int sum = 0;
            while(number>0){
                  int temp = number %10;
                  sum += Math.pow(temp, length);
                  number /= 10;
            }
            //System.out.println(original);
            //System.out.println(sum);
            if(sum == original)
                  return true;
            else
                  return false;
      }

      public static boolean checkNumberUsingStream(int number){

            String numString = String.valueOf(number);
            int length = numString.length();

            int sum = numString.chars().map(x -> (int) Math.pow(x-'0', length)).sum();
            //numString.chars().mapToObj(x-> {return (char)x;}).forEach(System.out::println);

            System.out.println(sum);
            System.out.println(number);
            return number == sum;
      }
      public static void main(String[] args) {

            int number = 153;
            System.out.println(checkNumber(number));
            System.out.println(checkNumber(407));
            System.out.println(checkNumber(302));
            System.out.println(checkNumberUsingStream(153));

      }
}
