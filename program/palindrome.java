package com.java.program;

public class palindrome {

      public static boolean checkPalindrome(int number){

            int rev = 0;
            int temp = 0;
            int orignal = number;
            while(number>0){
                  temp = number%10;
                  rev = rev * 10 + temp;
                  number /= 10;
            }
            System.out.println(rev);
            System.out.println(orignal);
            if(rev == orignal)
                  return true;
            else
                  return false;
      }

      public static boolean checkPalindrome(String input){

            //StringBuffer sb = new StringBuffer(input);
            StringBuilder st = new StringBuilder(input);
            //System.out.println(sb);
            System.out.println(st);
            //System.out.println(sb.reverse());
            System.out.println(st.reverse());
            System.out.println(input.compareTo(st.reverse().toString()));
            if(input.compareTo(st.reverse().toString())==0){
                  return true;
            }
            return false;
      }



      public static void main(String[] args) {

            int num = 151;
            //System.out.println(checkPalindrome(num));
            String input = "RADAR";
            System.out.println(checkPalindrome("HELLO"));
      }
}
