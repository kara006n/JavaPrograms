package com.java.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//check if number is binary or not
public class Logic6 {

      public static boolean verifyUsingLoop(int num){

            while(num>0){
                  int temp = num%10;
                  if(temp != 0 && temp != 1)
                        return false;
                  num/=10;
            }

            return true;
      }

      public static boolean verifyUsingStreams(int num){

            //System.out.println(String.valueOf(num));
            return String.valueOf(num).chars().allMatch(ch->ch=='0' ||ch=='1');//here important i am comparing
            //with char 0 and 1 not with integer value as we know here streams generate unicode value of each
      }

      public static boolean verifyUsingRegularExp(int num){

            Matcher matcher = Pattern.compile("^[01]+$").matcher(String.valueOf(num));
            return matcher.matches();

      }


      public static void main(String[] args) {
            int num = 1010101;
            System.out.println(verifyUsingLoop(num));
            System.out.println(verifyUsingStreams(num));
            System.out.println(verifyUsingRegularExp(num));

      }
}
