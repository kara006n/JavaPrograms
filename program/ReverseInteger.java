package com.java.program;

public class ReverseInteger {

      public static void main(String[] args) {

            int Number = 12345;
            int rev = 0;
            while(Number!=0){

                  int num = Number%10;
                  //System.out.println(num);
                  rev = rev*10 + num;
                  Number/=10;

            }

            System.out.println(rev);
            int num = 12345;
            System.out.println(new StringBuffer(String.valueOf(num)).reverse());



      }
}
