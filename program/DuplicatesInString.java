package com.java.program;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {

      public static void duplicates(String str){

            String[] s = str.split(" ");
            Map<String, Integer> map = new HashMap<>();
            int length = s.length;

            for(String s1:s){
                  map.put(s1, map.getOrDefault(s1,0)+1);
            }

            for(String  s2: map.keySet()){
                  if(map.get(s2)>1){
                        System.out.println(s2+" appeared "+map.get(s2)+" times");
                  }
            }
      }

      public static void main(String[] args) {

            String str = "Hey java is java best language is java";
            duplicates(str);

      }
}
