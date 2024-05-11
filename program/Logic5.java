package com.java.program;
//reverse number using recursion
public class Logic5 {

      public static int reverse(int num, int rev){

            if(num<=0)
                  return rev;
            int temp = num%10;
            rev = rev*10+temp;
            return reverse(num/10, rev);
      }

      public static void main(String[] args) {

            int num = 123;
            int reverse = reverse(num, 0);
            System.out.println(reverse);
      }
}
