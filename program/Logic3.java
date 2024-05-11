package com.java.program;
//in case of string its hashcode() method inherited from object class is used to get hash value then it is
//used to calculate the index of bucket and also it is saved in memory cache see naveen automation lab video
import java.util.HashMap;

public class Logic3 {

      public static void main(String[] args) {

            String s = "hello";
            HashMap<String, Integer> h = new HashMap<>();
            h.put(s, 100);
            s="neil";
            System.out.println(h.get("hello"));

      }
}
