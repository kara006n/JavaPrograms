package com.java.program;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArray {

      public static void main(String[] args) {

            String names[]  = {"Java", "JavaScript","Ruby", "C", "Java", "Python"};

            System.out.println("using normal approach");
            for(int i = 0; i< names.length; i++){
                  for(int j = i+1; j< names.length; j++){

                        if(names[i].equals(names[j])){
                              System.out.println("Duplicate element is "+names[i]);
                        }
                  }
            }

            System.out.println("second approach using hashSet");
            Set<String> store = new HashSet<>();
            for(String name: names){
                  if(store.add(name)==false){
                        System.out.println("Duplicate element is "+ name);
                  }
            }

            System.out.println("third approach using hashMap");
            Map<String, Integer> storeMap = new HashMap<>();
            for (String name: names){
                  storeMap.put(name, storeMap.getOrDefault(name,0)+1);
            }
            //System.out.println(storeMap);
            for(String name: storeMap.keySet()){
                  if(storeMap.get(name)>1){
                        System.out.println("Duplicate Key is "+name);
                  }
            }


      }
}
