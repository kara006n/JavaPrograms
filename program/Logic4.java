package com.java.program;
//print name 1000 times without loop
import java.util.Arrays;

public class Logic4 {
      public static void main(String[] args) {

            String a[] = new String[1000];
            String s = "Neel Kamal";
            Arrays.stream(a).map(e->e=s).forEach(x-> System.out.println(x));
      }
}
