package com.java.program;

import java.util.stream.IntStream;

public class Print1To100 {


      public static void generate1To100WithoutLoop(int number){

            if(number>100)
                  return;
            System.out.println(number);
            generate1To100WithoutLoop(number+1);
      }

      public static void generate1To100WithoutLoop(){

            IntStream.range(1,101).forEach(x->System.out.println(x));

      }





      public static void main(String[] args) {

//            char ch = 'A';
//            int i = (int)ch-64;
//            while(i<=100){
//                  System.out.println(i);
//                  i++;
//            }

            generate1To100WithoutLoop();


      }
}
