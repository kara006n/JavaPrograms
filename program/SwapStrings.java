package com.java.program;

public class SwapStrings {

      public static void main(String[] args) {

            //swap without using third variable
            String a ="Hello";
            String b = "World";

            System.out.println("before swapping");
            System.out.println("the value of a is : "+a);
            System.out.println("the value of b is : "+b);

            int length = a.length();
            a = a+b;
            b = a.substring(0,length);
            a = a.substring(length);

            System.out.println("after swapping");
            System.out.println("the value of a is : "+a);
            System.out.println("the value of b is : "+b);


      }
}
