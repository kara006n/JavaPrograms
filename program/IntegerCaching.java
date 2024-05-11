package com.java.program;

public class IntegerCaching {

      public static void main(String[] args) {

            Integer x =100;//use 190 in place of 100
            Integer y =100;//use 190 in place of 100

            if(x==y)
                  System.out.println("Both are equal");
            else
                  System.out.println("Both are not equal");
      }
}
//we know == checks object reference not content but in case of primitive types it checks content not reference like for int. char etc.
//but if we keep value of x and y in range of int i.e. -128 to +127 then this Integer class is autoUnboxed to int primitive type and then == is used according too primitive type hence
//it says equal but when range is outside integer range then auto unboxing doesn't happen so, they are treated like Object and == behave accordingly.