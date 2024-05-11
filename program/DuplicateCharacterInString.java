package com.java.program;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateCharacterInString {

      public static void duplicate(String s){

            if(s==null)
                  System.out.println("Null String");

            if(s.isEmpty())
                  System.out.println("Empty String");

            if(s.length()==1)
                  System.out.println("Single character String");

            char[] chars = s.toCharArray();
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(char ch: chars){
                  hashMap.put(ch, hashMap.getOrDefault(ch,0)+1);
            }

            //System.out.println(hashMap);

            for(char ch: hashMap.keySet()){
                  if(hashMap.get(ch)>1){
                        System.out.println(ch+":"+hashMap.get(ch));
                  }
            }
      }

      public static void main(String[] args) {

            String s = "hello";
            duplicate(s);
      }
}
