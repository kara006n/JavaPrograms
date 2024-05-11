package com.java.program;

public class Output1 {

      public static void main(String[] args) {

            int i = (byte) +(char) -(int) +(long) -1;
            //when these operators are used with one operand then they are treated as unary and here all these operators are with one operand so there are unary
            //so start from right side first we have -1 type casted to long to it will be -1 in long then + unary operator makes no effect then type cast to int then - operator with
            //change -1 of int to plus 1 here also - is unary and then continue and here value is 1 that is why it can be easily type casted from long to byte because no issue of bit
            //will be there because 1 can be stored in all but if value will be large then this may not be the case.
            System.out.println(i);

      }
}
