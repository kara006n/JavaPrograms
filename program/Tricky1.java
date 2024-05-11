package com.java.program;

public class Tricky1 {


      public static void main(String[] args) {
            System.out.println(Main.x);
      }
}

class Main{

      public static int x = 100;

      static{
            System.out.println("Static Block");
      }


}
