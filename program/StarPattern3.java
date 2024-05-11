package com.java.program;

//same like start pattern 2 only i have added space before printing *
public class StarPattern3 {

      public static void main(String[] args) {

            for (int i =1; i<=5; i++){
                  for(int j =4; j>=i; j--){
                        System.out.print(" ");
                  }
                  for(int k =1; k<=i; k++){
                        System.out.print(" *");
                  }
                  System.out.println();
            }


            System.out.println("***********************************************");


      }
}
